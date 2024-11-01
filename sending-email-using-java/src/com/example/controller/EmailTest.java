package com.example.controller;

import com.example.service.EmailService;
import com.example.view.EmailView;

public class EmailTest {
	public static void main(String[] args) {
		EmailView view = new EmailView();
		EmailService service = new EmailService();
		EmailController controller = new EmailController(view, service);
		controller.sendEmail();
	}
}
