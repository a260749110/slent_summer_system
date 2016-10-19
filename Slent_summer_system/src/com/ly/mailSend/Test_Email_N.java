package com.ly.mailSend;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Test_Email_N {
    public static void  main(String args[]){
        try {
            send_email();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void send_email() throws IOException, AddressException, MessagingException{

    	File file =new File("F:\\onepre\\sendData.txt");
        String data = "";
    	InputStreamReader  fi=new InputStreamReader (new FileInputStream(file),"GBK");
    	BufferedReader bufferedReader = new BufferedReader(fi);
    	for(String st=bufferedReader.readLine();st!=null;st=bufferedReader.readLine())
    	{
    		data+=st+"\n\r";
    	}
    	String iso = new String(data.getBytes("UTF-8"),"ISO-8859-1");   
    	String utf8=new String(iso.getBytes("ISO-8859-1"),"UTF-8");  
    	String enc=java.net.URLEncoder.encode(data, "UTF-8");
    	String content="<onepred>"+enc+"<onepred>";
   
//    	for()
        String to = "a1156006619@163.com";
        String subject = "onedaypre";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.qq.com");
        properties.put("mail.smtp.port", "25");
        properties.put("mail.smtp.auth", "true");
        Authenticator authenticator = new Email_Authenticator("1156006619@qq.com", "fei260749110");
        javax.mail.Session sendMailSession = javax.mail.Session.getDefaultInstance(properties, authenticator);
        sendMailSession.setDebug(true);
        MimeMessage mailMessage = new MimeMessage(sendMailSession);
        mailMessage.setFrom(new InternetAddress("1156006619@qq.com"));
        // Message.RecipientType.TO���Ա�ʾ�����ߵ�����ΪTO
        mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        mailMessage.setSubject(subject, "UTF-8");
       
        mailMessage.setSentDate(new Date());
        // MiniMultipart����һ�������࣬��MimeBodyPart���͵Ķ���
        Multipart mainPart = new MimeMultipart();
        // ����һ����HTML���ݵ�MimeBodyPart
        BodyPart html = new MimeBodyPart();
        html.setContent(content.trim(), "text/html; charset=utf-8");
        mainPart.addBodyPart(html);
        mailMessage.setContent(mainPart);
        Transport.send(mailMessage);
    }
}
