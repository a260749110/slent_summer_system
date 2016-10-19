package com.data;

import java.util.Random;

import com.sql.mapperXml.TNoahTitlesWithBLOBs;


public class MenuHelper {
public final static MenuHelper instance=new MenuHelper();
private MenuHelper ()
{}
private Random random=new Random();
public long getNextMenuId() {
	TNoahTitlesWithBLOBs titlesWithBLOBs=DataHelper.instance.getTitleData("MenuId");
	if(titlesWithBLOBs==null)
	{
		titlesWithBLOBs=new TNoahTitlesWithBLOBs();
		titlesWithBLOBs.setnIndex("MenuId");
		titlesWithBLOBs.setnValue((System.currentTimeMillis()*2000+random.nextInt(1000)+""));
	
	}
	else
	{
		try {
			titlesWithBLOBs.setnValue(Long.valueOf(titlesWithBLOBs.getnValue())+random.nextInt(1000)+"");
		} catch (Exception e) {
			// TODO: handle exception
			titlesWithBLOBs.setnValue((System.currentTimeMillis()*2000+random.nextInt(1000)+""));
		}
		
	}
	DataHelper.instance.saveTitleData(titlesWithBLOBs);
	return Long.valueOf(titlesWithBLOBs.getnValue());
}
public void  displayNeed(float momey)
{
	byte[] b={0x1b,0x73,0x32};
	PortHelper.instance.write(toPortShowByes(momey),b);
	}
private byte[] toPortShowByes(float f)
{
	byte fbs[]=(f+"").getBytes();
	byte []result=new byte[fbs.length+4];
	result[0]=0x1b;
	result[1]=0x51;
	result[2]=0x41;
	result[result.length-1]=0x0d;
	for(int i=0;i<fbs.length;i++)
	{
		result[i+3]=fbs[i];
	}
			return result;
	}
}
