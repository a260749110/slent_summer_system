package com.ly.mailRead;

import java.io.ByteArrayOutputStream;
import java.util.Properties;

import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

/**
 * 
 * @author 1372940767@qq.com
 * 
 */

public class EmailClient { public static void main(String[] args) throws Exception {  
    // ����pop3��������������Э�顢�û�������  
    String pop3Server = "pop3.163.com";  
    String protocol = "pop3";  
    String user = "a1156006619@163.com";  
    String pwd = "zzzeihiodskuueux";  
      
    // ����һ���о���������Ϣ��Properties����  
    Properties props = new Properties();  
    props.setProperty("mail.store.protocol", protocol);  
    props.setProperty("mail.pop3.host", pop3Server);  
      
    // ʹ��Properties������Session����  
    Session session = Session.getInstance(props);  
    session.setDebug(false);  
      
    // ����Session������Store���󣬲�����pop3������  
    Store store = session.getStore();  
    store.connect(pop3Server, user, pwd);  
      
    // ��������ڵ��ʼ���Folder������"ֻ��"��  
    Folder folder = store.getFolder("inbox");  
    folder.open(Folder.READ_WRITE);  
      
    // ����ʼ���Folder�ڵ������ʼ�Message����  
    Message [] messages = folder.getMessages();  
 
    int mailCounts = messages.length;  
    for(int i = 0; i < mailCounts; i++) {  
          
        String subject = messages[i].getSubject();  
        String from = (messages[i].getFrom()[0]).toString();  
          
        System.out.println("�� " + (i+1) + "���ʼ������⣺" + subject);  
        System.out.println("�� " + (i+1) + "���ʼ��ķ����˵�ַ��" + from);  
          
//        System.out.println("�Ƿ�򿪸��ʼ�(yes/no)?��");  
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
////        String input = br.readLine();  
        if(subject.equals("onedaypre")) {  
            // ֱ�����������̨��  
        	 ByteArrayOutputStream outStream = new ByteArrayOutputStream(); 
            messages[i].writeTo(outStream);
            String str=new String(outStream.toByteArray(),"ISO-8859-1");
            String strs[]=str.split("<onepred>");
            if(strs.length==3)
            {
            	String sto=java.net.URLDecoder.decode(strs[1],"UTF-8");
            System.out.println(sto); 
            }
//            String aa=ip.r
//        	System.out.println( ip.read()); 
        	
//        	ip.close();
        }           
        else
        {
        	messages[i].setFlag(Flag.DELETED, true);
        }
    }  
    folder.close(true);  
    store.close();  
}  }
