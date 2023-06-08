package com.Argano.utlis;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


	public class EmailsHandler {
	private static Properties properties = System.getProperties();
	private static Session session;
	private static MimeMessage message;
	private static Multipart multipart = new MimeMultipart();

	public void setProperties() {
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
	}

	public void auth(final String userName, final String authKey) {
		session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, authKey);
			}
		});
		session.setDebug(true);
		message = new MimeMessage(session);
	}

	public void setUpEmail(String from, String[] to, String subject) {
		try {

			message.setFrom(new InternetAddress(from));
			for(String temp : to)
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(temp));
			message.setSubject(subject);

		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addMessage(String text) {
		try {
			BodyPart bodyMessage = new MimeBodyPart();
			bodyMessage.setText(text);
			multipart.addBodyPart(bodyMessage);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addHtml(String htmlContent)
	{
		try {
			message.setContent(htmlContent,"text/html");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addAttachment(String directory) {
		try {

			BodyPart bodyAttachment = new MimeBodyPart();
			bodyAttachment.setDataHandler(new DataHandler(new FileDataSource(directory)));
			multipart.addBodyPart(bodyAttachment);
			message.setContent(multipart);

		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void send()
	{
		try {
		System.out.println("Sending...");
		Transport.send(message);
		System.out.println("Sent successfully");
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
