package com.example.service;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.example.model.Email;

public class EmailService {

	public void sendEmail(Email email) {

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getDefaultInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("v4vinnu15@gmail.com", "sgrt ipvm ugkf xxnu");
			}
		});

		try {
			Message mes = new MimeMessage(session);

			mes.setFrom(new InternetAddress("v4vinnu15@gmail.com"));
			mes.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email.getRecipient()));
			mes.setSubject(email.getSubject());
			mes.setText(email.getBody());

			Transport.send(mes);
			System.out.println("Email sent successfully..");
		} catch (MessagingException e) {
			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}

	}

}
