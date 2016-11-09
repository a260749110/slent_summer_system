package com.vip;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

import com.data.DataHelper;
import com.page.helper.PageHelperBase;
import com.sql.mapperBean.SVip;
import com.unit.PageHelperBaseObject;
import com.user.vip.SSVipManager;
import com.vip.common.ESessionData;
import com.vip.utils.AutoClearnMap;
import com.vip.utils.DefInfo;

public class VipManeger {
	private AutoClearnMap<Long, VipInfo> vipLonginMap;
	public static VipManeger instance = new VipManeger();
	public static int WRONG_TIMES = 10;

	private VipManeger() {
		vipLonginMap = new AutoClearnMap<>(3 * 60 * 60 * 1000l);
	}

	public VipInfo getVipInfo(HttpServletRequest request) {
		VipInfo result = (VipInfo) request.getSession().getAttribute(ESessionData.VIP_INFO.getCode());
		if (result == null) {
			result = new VipInfo(new SVip());
			result.sVip.setId(-1l);
			result.sVip.setName("test");
			result.isLogin = false;
			return result;
		}

		if (!vipLonginMap.contains(result.sVip.getId(), result)) {
			result.isLogin = false;
		}

		return result;
	}

	public boolean sign(HttpServletRequest request, HttpServletResponse response, JspWriter out) {
		VipInfo vipInfo = getVipInfo(request);
		if (vipInfo.isLogin&&!vipInfo.signFlag) {
			
			PageHelperBaseObject result = new PageHelperBaseObject();
			vipInfo.cell.setSignCount(vipInfo.cell.getSignCount()+1);
			vipInfo.cell.setSignTime(System.currentTimeMillis());
			
			vipInfo.sVip.setHistory(vipInfo.sVip.getHistory()+0.5f);
			//vipInfo.signFlag=true;
			vipInfo.reflash();
			DataHelper.instance.updataSvipById(vipInfo.sVip);
			
			result.setFlag(true);
			result.getMsg().append("签到成功!");
			try {
				out.append(result.toJSONObjectStr());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	public void login(HttpServletRequest request, HttpServletResponse response, JspWriter out) {
		String name = request.getParameter("name");
		String passw = request.getParameter("passw");
		try {
			Object object = request.getSession().getValue(ESessionData.VIP_WRONG.getCode(name));
			Integer times = null;
			if (object != null && (object instanceof Integer)) {
				times = (Integer) object;
			} else {
				times = 0;
			}
			;
			if (times >= WRONG_TIMES) {

				out.append("<script type='text/javascript'>alert('失败次数过多，请稍后再操作。或前往前台找回密码')</script>");
				return;
			}
			if (name != null && passw != null && !name.isEmpty() && !passw.isEmpty()) {
				SVip sVip = SSVipManager.instance.getVipData(Long.valueOf(name));
				if (sVip != null) {
					if (sVip.getPassW().equals(passw)) {
						VipInfo vipInfo = new VipInfo(sVip);
						vipInfo.isLogin = true;
						vipLonginMap.put(sVip.getId(), vipInfo);
						request.getSession().setAttribute(ESessionData.VIP_INFO.getCode(), vipInfo);
						response.sendRedirect(request.getContextPath() + DefInfo.DEF_VIP_HOME);
						times = 0;
					} else {

						out.append("<script type='text/javascript'>alert('密码错误')</script>");
						times++;
					}
				} else {

					out.append("<script type='text/javascript'>alert('密码错误')</script>");
					times++;
				}

			}
			request.getSession().setAttribute(ESessionData.VIP_WRONG.getCode(name), times);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
