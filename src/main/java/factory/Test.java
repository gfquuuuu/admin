package factory;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

public class Test {
	
	private String name;
	private String str;
	
	public Test(){}
	
	public Test(String name){
		this.name = name;
	}
	
	public Test(String name, String str){
		this.name = name;
		this.str = str;
	}

	public static void main(String[] args) throws EmailException, MalformedURLException {
		sendHtmlEmail();
		//sendEmail();

	}
	
	public static void sendEmail() throws EmailException{
		// 定义发送简单邮件对象
	    SimpleEmail simpleEmail = new SimpleEmail();

	    // 设置SMTP服务器,比如:smtp.163.com
	    // Set the hostname of the outgoing mail server.
	    simpleEmail.setHostName("smtp.163.com");
	    // 设置登入认证服务器的用户名和密码
	    // Sets the userName and password if authentication is needed. If this
	    // method is not used, no authentication will be performed.
	    simpleEmail.setAuthentication("13714947594@163.com", "3611824gfq");

	    // 默认是25端口
	    simpleEmail.setSslSmtpPort("465");
	    // SSL enabled SMTP server,即如果是支持SSL服务器的端口是465
	    // simpleEmail.setSmtpPort(465);//gmail邮箱服务器就是支持SSL的。

	    // 设置发送人邮箱和名字
	    simpleEmail.setFrom("13714947594@163.com", "工信局", "utf-8");

	    // 设置收件人可以是多个
	    simpleEmail.addTo("1756390078@qq.com", "agan");
	    // simpleEmail.addTo(String ...emails);

	    // 设置发送主题
	    simpleEmail.setSubject("拉萨市工信局");

	    // 设置发送主体内容
	    simpleEmail.setMsg("拉萨市工信局门户网站");

	    // 确定发送邮件动作
	    simpleEmail.send();
	    System.out.println("send mail success");
	}
	
	public static void sendHtmlEmail() throws EmailException, MalformedURLException{
		// Create the email message
				HtmlEmail email = new HtmlEmail();
				email.setHostName("smtp.qq.com");
				email.setAuthentication("1810377902@qq.com", "ukpgxggftluhecgb");
				email.setSmtpPort(587);
				email.setFrom("1810377902@qq.com", "工信局", "utf-8");
				email.addTo("1756390078@qq.com", "agan");
				email.setSubject("拉沙是用虚拟级");
			    URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
				String cid = email.embed(url, "chelogo");
				email.setHtmlMsg("<html>The apache logo - <img src=\"cid:" + cid + "\"></html>");
				// set the alternative message
				//email.setTextMsg("Your email client does not support HTML messages");
	
				// send the email
				email.send();
				System.out.println("发送成功！！！");
	}

}
