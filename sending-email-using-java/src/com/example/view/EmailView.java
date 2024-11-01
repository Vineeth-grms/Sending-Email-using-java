package com.example.view;

import java.util.Scanner;

import com.example.model.Email;

public class EmailView {

	private Scanner scan = new Scanner(System.in);

	public Email getEmailInput() {

		System.out.print("Enter Recipient's Email : ");
		String recipient = scan.nextLine();
		System.out.print("Enter Email Subject : ");
		String subject = scan.nextLine();
		System.out.println("Enter email body (type 'END' on a new line to finish):");
		StringBuilder body = new StringBuilder();
		while (true) {
			String line = scan.nextLine();
			if (line.equalsIgnoreCase("END")) {
				break;
			}
			body.append(line).append("\n");
		}

		return new Email(recipient, subject, body.toString());

	}

	public void displayMessage(String message) {
		System.out.println(message);
	}

}
