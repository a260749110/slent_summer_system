package com.unit;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.standard.PrinterName;

public class PrintTicketTool {


public static void print(String str)
{	PrintWarranty2 p2=new PrintWarranty2(1,"2132303330001",str,"0");	//PrintWarranty t=new PrintWarranty(1,"2132303330001","12345\r\n678901234567890\r\n123456789","0");
		p2.PrintLabel("Xprinter XP-370B");
	}
	private static class PrintWarranty2 implements Printable {  
		  
		  
		/** 
		*   * @param Graphic指明打印的图形环境   * @param 
		* PageFormat指明打印页格式（页面大小以点为计量单位，1点为1英寸的1/72，1英寸为25.4毫米。A4纸大致为595×842点）   * @param 
		* pageIndex指明页号 
		**/  
		int PageNumbers;  
		String StartSN;  
		String Model;  
		String Format;  
		public PrintWarranty2(int PageNumbers,String StartSN,String Model,String Format)  
		{  
		    this.PageNumbers=PageNumbers;  
		    this.StartSN=StartSN;  
		    this.Model=Model;  
		    this.Format=Format;  
		}  
		public void SetPageNum(int PageNumbers)  
		{  
		    this.PageNumbers=PageNumbers;  
		}  
		public int getPageNum()  
		{  
		    return PageNumbers;  
		}  
		public void SetStartSN(String StartSN)  
		{  
		    this.StartSN=StartSN;  
		}  
		public String getStartSN()  
		{  
		    return StartSN;  
		}  
		public void SetModel(String Model)  
		{  
		    this.Model=Model;  
		}  
		public String getModel()  
		{  
		    return Model;  
		}  
		public void SetFormat(String Format)  
		{  
		    this.Format=Format;  
		}  
		public String getFormat()  
		{  
		    return Format;  
		}  
		public int print(Graphics gra, PageFormat pf, int pageIndex) throws PrinterException {  
		   Graphics2D g2 = (Graphics2D) gra;  
		   // 设置打印颜色为黑色  
		   g2.setColor(Color.black);  
		   Font font = new Font("MS PGothic", Font.PLAIN, 8);  
		   g2.setFont(font); // 设置字体  
		   if (pageIndex >= PageNumbers)  
		        return NO_SUCH_PAGE;  
		   String SN=StartSN.substring(6, 12);  
		   int intSN=Integer.parseInt(SN);  
		   intSN=intSN+pageIndex;  
		   NumberFormat formattern = new DecimalFormat("0000");  
		   SN=formattern.format(intSN);  
		   //System.out.println(SN);  
		  
		  String[] pritf=Model.split("\r\n");
		  int line=25;
		  for(String str:pritf)
		  {  g2.drawString(str, (float) 10, (float) line );
			  line+=10;
		  }
//		          g2.drawString(Model, (float) 10, (float) 23 ); //第二排  
//		          g2.drawString(Model, (float) 10, (float) 33); //第二排  
//		          g2.drawString(Model, (float) 10, (float) 43); //第二排  
		       //   g2.drawString(StartSN.substring(0, 6)+SN, (float) 266, (float) 145 ); //第三排   
		     
		    return PAGE_EXISTS;  
		}  
		  
		  
		public void PrintLabel(String PrintQ) {  
		   //ReadData();  
		   // 通俗理解就是书、文档  
		   Book book = new Book();  
		   // 设置成竖打  
		   PageFormat pf = new PageFormat();  
		   pf.setOrientation(PageFormat.PORTRAIT); // LANDSCAPE表示竖打;PORTRAIT表示横打;REVERSE_LANDSCAPE表示打印空白  
		   // 通过Paper设置页面的空白边距和可打印区域。必须与实际打印纸张大小相符。  
		   Paper p = new Paper();  
		   p.setSize(100, 90); // Warranty Paper Size,A4 590, 840  
		   p.setImageableArea(0, 0, 800, 800); // Print Area  
		   pf.setPaper(p);  
		   // 把 PageFormat 和 Printable 添加到书中，组成一个页面  
		   book.append(this, pf,this.getPageNum());  
		   String printerName=PrintQ;    
		   HashAttributeSet hs = new HashAttributeSet();   
		   hs.add(new PrinterName(printerName,null));  
		   // 获取打印服务对象  
		   PrintService[] printService =PrintServiceLookup.lookupPrintServices(null, hs);    
		   PrinterJob job = PrinterJob.getPrinterJob();  
		   try {  
		     if(printService.length>0){  
		           job.setPrintService(printService[0]); 
		  	     //  设置打印类  
				     job.setPageable(book);  
				     //  Print  
				     job.print();  
		     }  
		     else
		     {
		     System.err.println("tick:"+Model);
		     //  设置打印类  
//		     job.setPageable(book);  
//		     //  Print  
//		     job.print();  
		     }
		  
		  
		   } catch (PrinterException e) {  
		     e.printStackTrace();  
		   }  
		}  
	}
}
