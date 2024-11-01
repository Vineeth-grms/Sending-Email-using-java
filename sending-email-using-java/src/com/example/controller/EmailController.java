package com.example.controller;

import com.example.model.Email;
import com.example.service.EmailService;
import com.example.view.EmailView;

public class EmailController {
	private EmailView emailView;
	private EmailService emailService;
	public EmailController(EmailView emailView, EmailService emailService) {
		super();
		this.emailView = emailView;
		this.emailService = emailService;
	}
	
	public void sendEmail() {
		Email mail = emailView.getEmailInput();
		emailService.sendEmail(mail);
	}

}
