//java发送邮件测试

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
		//设置邮件服务器
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
		
		
		
		/*//收件人邮箱
		String to="chc970223@126.com";
		
		//发件人
		String from="821559689@qq.com";
		
		//指定发送邮件的主机为localhost
		String host="localhost";
		
		//获取系统属性
		Properties properties=System.getProperties();
		
		//设置邮件服务器
		properties.setProperty("mail.smtp.host",host);
		
		//获取默认session对象
		Session session=Session.getDefaultInstance(properties);
		
		try{
			//创建默认的MimeMessage对象
			MimeMessage message=new MimeMessage(session);
			
			//set from ：头部头字段
			message.setFrom(new InternetAddress(from));
			
			//set to :头部头字段
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			
			//set subject:头部头字段
			message.setSubject("java发送邮件测试");
			
			//设置消息体
			message.setText("这是测试");
			
			//发送消息
			Transport.send(message);
			System.out.println("发送成功");
		}catch(MessagingException mex){
			mex.printStackTrace();*/
		}
	public static MimeMessage createSimpleMail(Session session) throws Exception{
		MimeMessage message=new MimeMessage(session);
		message.setFrom(new InternetAddress("chc970223@126.com"));
	
		message.setRecipient(Message.RecipientType.TO,new InternetAddress("821559689@qq.com"));
		//set subject:头部头字段
		message.setSubject("java发送邮件测试");
		
		//设置消息体
		message.setConntent("这是测试","text/html;charset=UTF-8");
		return message;
	}

}