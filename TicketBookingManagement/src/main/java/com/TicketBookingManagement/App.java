package com.TicketBookingManagement;

import java.util.Scanner;

import com.TicketBookingManagement.daoimpl.TicketDaoImpl;

//Railway Ticket Management System
public class App {
	public static void main(String[] args) {
		TicketDaoImpl tdao = new TicketDaoImpl();
		char c;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"PRESS 1 for Enter Pasenger Details \nPRESS 2 for display Pasenger Details \nPress 3 For Exit");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				tdao.createPasenger();
				break;
			case 2:
				tdao.fetchPasenger();
				break;

			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("INVALID CHOICE");
			}
			System.out.println("Do you Want to Continue ? Y/N");
			c = sc.next().charAt(0);
		} while (c == 'y' || c == 'Y');
		System.out.println("___Thank You___");
	}
}
