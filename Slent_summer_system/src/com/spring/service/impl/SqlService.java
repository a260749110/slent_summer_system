package com.spring.service.impl;

import org.springframework.web.context.ContextLoaderListener;

import com.spring.sql.dao.SGiftItemDao;
import com.spring.sql.dao.SPrizeDrawItemDao;
import com.spring.sql.dao.SVipDao;
import com.spring.sql.dao.SVipGiftDao;
import com.spring.sql.dao.TLandIdDao;
import com.spring.sql.domain.SVipGiftPo;

public class SqlService {

	public SVipDao sVipDao;
	private static SqlService instance;
	public SPrizeDrawItemDao prizeDrawItemDao;
	public TLandIdDao landIdDao;
	public SVipGiftDao sVipGiftDao;
	public SGiftItemDao sGiftItemDao;

	private SqlService() {
		sVipDao = getBean(SVipDao.class);
		landIdDao = getBean(TLandIdDao.class);
		prizeDrawItemDao = getBean(SPrizeDrawItemDao.class);
		sVipGiftDao =getBean(SVipGiftDao.class);
		sGiftItemDao =getBean(SGiftItemDao.class);

	}

	private <T> T getBean(Class<T> c) {

		return ContextLoaderListener.getCurrentWebApplicationContext().getBean(c);

	}

	public static SqlService getInstance() {
		if (instance == null)
			instance = new SqlService();
		return instance;
	}

}
