package com.vip.interfaceCells;

import javax.servlet.http.HttpServletRequest;

import com.spring.sql.dao.SGiftItemDao;
import com.spring.sql.domain.SGiftItemPo;
import com.vip.VipInfo;

public interface GiftHandler {
public void  hande(VipInfo vipInfo,SGiftItemPo itemPo);
}
