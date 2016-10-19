package com.sql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.Config;

public class MyBatisManager {
	public static MyBatisManager instance = new MyBatisManager();
	private SqlSessionFactory sessionFactory;
	private Logger logger=Logger.getLogger(this.getClass());
	// private static String config = "/conf_loacl.xml";
	private static String config = Config.MybBatisConfig;
	public void init(){
		logger.info("MyBatisManager init!");
	};
	private MyBatisManager() {
		System.err.println(getClass().getResource(""));
		// String url = getClass().getResource("").toString().replace("file:",
		// "")
		// + config;
		String str = Config.MybBatisConfig;
		;
		FileInputStream ist = null;
		try {
			ist = new FileInputStream(this.getClass().getResource(str)
					.getPath());

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.err.println("ist !!:" + (ist == null));
		// File f = new File(url);
		// System.err.println("f:" + url + f.exists() + "!!!!!!!!!!!!!");
		try {
			// InputStream is = new FileInputStream(f);

			// if (is == null)
			// System.err.println("is null");
			sessionFactory = new SqlSessionFactoryBuilder().build(ist);

			ist.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	
	
	
	public SqlSession getSession() {
		return sessionFactory.openSession();
	}
}
