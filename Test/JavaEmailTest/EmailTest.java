//java�����ʼ�����

/*import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
*/
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailTest{
	public static void main(String[] args){
		
		Properties proper = new Properties();
		//�����ʼ�������
		proper.setProperty("mail.host", "mail.126.com");
		proper.setProperty("mail.transport.protocol", "smtp");
		proper.setProperty("mail.smtp.auth", "true");
				
		Session session=new Session.getInstance(proper);
		
		session.setDebug(true);
		
		Transport ts=session.getTransport();
		
		ts.connect("mail.126.com","chc970223","12zx13zc");
		
		Message message=createSimpleMail(session);
		
		ts.sendMessage(message, message.getAllRecipients());
		ts.close();
		
		
		
		/*//�ռ�������
		String to="chc970223@126.com";
		
		//������
		String from="821559689@qq.com";
		
		//ָ�������ʼ�������Ϊlocalhost
		String host="localhost";
		
		//��ȡϵͳ����
		Properties properties=System.getProperties();
		
		//�����ʼ�������
		properties.setProperty("mail.smtp.host",host);
		
		//��ȡĬ��session����
		Session session=Session.getDefaultInstance(properties);
		
		try{
			//����Ĭ�ϵ�MimeMessage����
			MimeMessage message=new MimeMessage(session);
			
			//set from ��ͷ��ͷ�ֶ�
			message.setFrom(new InternetAddress(from));
			
			//set to :ͷ��ͷ�ֶ�
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			
			//set subject:ͷ��ͷ�ֶ�
			message.setSubject("java�����ʼ�����");
			
			//������Ϣ��
			message.setText("���ǲ���");
			
			//������Ϣ
			Transport.send(message);
			System.out.println("���ͳɹ�");
		}catch(MessagingException mex){
			mex.printStackTrace();*/
		}
	public static MimeMessage createSimpleMail(Session session) throws Exception{
		MimeMessage message=new MimeMessage(session);
		message.setFrom(new InternetAddress("chc970223@126.com"));
	
		message.setRecipient(Message.RecipientType.TO,new InternetAddress("821559689@qq.com"));
		//set subject:ͷ��ͷ�ֶ�
		message.setSubject("java�����ʼ�����");
		
		//������Ϣ��
		message.setConntent("���ǲ���","text/html;charset=UTF-8");
		return message;
	}

}