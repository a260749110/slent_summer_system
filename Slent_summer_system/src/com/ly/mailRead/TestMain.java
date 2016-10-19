package com.ly.mailRead;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;

import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

public class TestMain {
	public static void main(String[] args) {
        String imapserver = "smtp.qq.com"; // �ʼ�������
        String user = "1156006619@qq.com"	;
        String pwd = "fei260749110";     // �������ѵ������޸�
            // ��ȡĬ�ϻỰ
            Properties prop = System.getProperties();
            prop.put("mail.imap.host",imapserver);
           
            prop.put("mail.imap.auth.plain.disable","true");
            Session mailsession=Session.getInstance(prop,null);
            mailsession.setDebug(false); //�Ƿ�����debugģʽ
            IMAPFolder folder= null;
            IMAPStore store=null;
            int total= 0;
            try{
               store=(IMAPStore)mailsession.getStore("mail");  // ʹ��imap�Ự���ƣ����ӷ�����
               store.connect(imapserver,user,pwd);
               folder=(IMAPFolder)store.getFolder("INBOX"); //�ռ��� 
               // ʹ��ֻ����ʽ���ռ��� 
               folder.open(Folder.READ_WRITE);
               //��ȡ���ʼ���
               total = folder.getMessageCount();
               System.out.println("-----------------�������乲���ʼ���" + total+" ��--------------");
               // �õ��ռ����ļ�����Ϣ����ȡ�ʼ��б�
         Message[] msgs =folder.getMessages();
               System.out.println("\t�ռ�������ʼ�����" + msgs.length);  
               System.out.println("\tδ���ʼ�����" + folder.getUnreadMessageCount());  
               System.out.println("\t���ʼ�����" + folder.getNewMessageCount());  
               System.out.println("----------------End------------------");
            }
            catch(MessagingException ex){
                 System.err.println("�����Զ�д��ʽ������!");
                 ex.printStackTrace();
            }finally {
       // �ͷ���Դ
              try{
                  if(folder!=null)
                      folder.close(true); //�˳��ռ���ʱ,ɾ������ɾ����ʶ���ʼ�
                 if (store != null)
                    store.close();
                }catch(Exception bs){
                 bs.printStackTrace();
                }             
            }          
    }
}
