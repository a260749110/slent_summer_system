package com.ly.tool.emailTool;

import java.io.File;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.ly.mailSend.Email_Authenticator;

public class EmailSender {
	public String name=null;
	public String passw=null;
	public String host=null;
	private Properties properties;
	private Email_Authenticator authenticator;
	private Session sendMailSession;
public EmailSender(String name,String passw,String host)
{
	this.name=name;
	this.passw=passw;
	this.host=host;
	
	if(name==null||passw==null||host==null)
		return ;
	
	properties = new Properties();
	properties.put("mail.smtp.host", host);
	properties.put("mail.smtp.port", "25");
	properties.put("mail.smtp.auth", "true");
	authenticator = new Email_Authenticator(name, passw);
	sendMailSession = javax.mail.Session.getDefaultInstance(properties,
			authenticator);
	sendMailSession.setDebug(false);
	
	}
public boolean send(EmailData emailData)
{

	try {
		javax.mail.Session sendMailSession = javax.mail.Session
				.getDefaultInstance(properties, authenticator);
		sendMailSession.setDebug(true);
		MimeMessage mailMessage = new MimeMessage(sendMailSession);
		mailMessage.setFrom(new InternetAddress(name));

		
		InternetAddress[] idrs=new InternetAddress[emailData.addrs.size()];
		for (int i = 0; i < emailData.addrs.size(); i++) {
			idrs[i]=new InternetAddress(emailData.addrs.get(i));
		}
		mailMessage.setRecipients(Message.RecipientType.TO, idrs);
//		mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(
//				targetAddr));
		mailMessage.setSubject(emailData.title, "UTF-8");
		mailMessage.setSentDate(new Date());
		mailMessage.setText(emailData.data);
		
		
		if(emailData.files!=null&&emailData.files.size()>0)
		{
			 Multipart mainPart = new MimeMultipart(); 
			for (String name:emailData.files.keySet()) {
				File f=emailData.files.get(name);
				if(f!=null&&f.exists()&&f.isFile())
				{
					MimeBodyPart	 messageBodyPart = new MimeBodyPart(); 
					 FileDataSource fds = new FileDataSource(f);//得到数据源  
                     messageBodyPart.setDataHandler(new DataHandler(fds));//得到附件本身并至入BodyPart  
                     messageBodyPart.setFileName(f.getName());//得到文件名同样至入BodyPart  
                     mainPart.addBodyPart(messageBodyPart);  
				}
			}
			 mailMessage.setContent(mainPart);
		}
	
//		Multipart mainPart = new MimeMultipart();
	//
//		BodyPart html = new MimeBodyPart();
//		html.setContent(data, "text/html; charset=utf-8");
//		mainPart.addBodyPart(html);
//		mailMessage.setContent(mainPart);
		Transport.send(mailMessage);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return false;
	}
	
	return true;}
public static void main(String args[]) {
	EmailSender sender=new EmailSender("1156006619@qq.com", "fei260749110", "smtp.qq.com");
	EmailData data=new EmailData("2021357379@qq.com");
	data.title="test";
	data.data="just a test mail";
	sender.send(data);
}
}
