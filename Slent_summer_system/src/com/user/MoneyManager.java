package com.user;

import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import org.apache.ibatis.session.SqlSession;

import com.sql.MyBatisManager;
import com.sql.mapper.TMonegChangeMapper;
import com.sql.mapper.TMoneyChangeTypeMapper;
import com.sql.mapperBean.TMonegChange;
import com.sql.mapperBean.TMoneyChangeType;
import com.sql.mapperBean.TMoneyChangeTypeExample;

public class MoneyManager {
	public static MoneyManager instance = new MoneyManager();

	private MoneyManager() {
	}

	public TMonegChange getMoneyLast() {
		TMonegChange result = new TMonegChange();
		SqlSession session = MyBatisManager.instance.getSession();
		TMonegChangeMapper mapper = session.getMapper(TMonegChangeMapper.class);
		result = mapper.selectByLast();
		System.err.println("r:" + result);
		session.close();

		return result;
	}

	public String getMonetChangeTpye(int id) {
		SqlSession session = MyBatisManager.instance.getSession();
		String str = "";
		TMoneyChangeTypeMapper changeTypeMapper = session.getMapper(TMoneyChangeTypeMapper.class);
		TMoneyChangeTypeExample example = new TMoneyChangeTypeExample();
		example.createCriteria().andMoneyChangeIdEqualTo(id);
		List<TMoneyChangeType> list = changeTypeMapper.selectByExample(example);
		if (!list.isEmpty()) {
			str = list.get(0).getMonetChangeType();
		}
		return str;
	}

	public void addMoneyChange(TMonegChange monegChange) {
		if (monegChange == null)
			return;
		SqlSession session = MyBatisManager.instance.getSession();
		TMonegChangeMapper mapper = session.getMapper(TMonegChangeMapper.class);

		mapper.insert(monegChange);
		session.commit();
		session.close();

	}

	Random random = new Random();
	TreeSet<Integer> saveId = new TreeSet<Integer>();

	public int getSaveId() {
		int id = 0;
		do {
			id = random.nextInt();

		} while (saveId.contains(id));
		saveId.add(id);
		return id;

	}

	public boolean canSave(int id)

	{
		if (saveId.contains(id)) {

			return true;
		}
		return false;
	}

	public List<TMoneyChangeType> getMoneyGetType() {
		SqlSession session = MyBatisManager.instance.getSession();
		TMoneyChangeTypeMapper mapper = session.getMapper(TMoneyChangeTypeMapper.class);
		TMoneyChangeTypeExample example = new TMoneyChangeTypeExample();
		example.createCriteria().andMoneyChangeIdLessThan(0);
		List<TMoneyChangeType> resault = mapper.selectByExample(example);
		session.close();
		return resault;
	}

	public void removeSaveId(int id) {
		saveId.remove(id);
	}
}
