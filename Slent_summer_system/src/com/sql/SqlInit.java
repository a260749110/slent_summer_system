package com.sql;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.data.DataHelper;
import com.page.data.MainPageData;
import com.user.LandManager;
import com.user.PermissionsManager;




public class SqlInit implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}
public static Timer timer=null;
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	//	logger.info("init SQL !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		MyBatisManager.instance.init();
		String str=System.getProperty("user.dir");
	//	logger.info(str);
		
		MainPageData data=new MainPageData();
		//		noahTitles=mapper.selectByExample(example)
		PermissionsManager.instance.init();
		LandManager.instance.init();

if(timer==null)
{
	timer=new Timer();
timer.scheduleAtFixedRate(new TimerTask() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stu
		DataHelper.instance.getTitleData("MenuId");
	}
}, 60000, 60000);	
}
//		WMPaySetDatabase.creatDataFromDatabase();
	}

}
