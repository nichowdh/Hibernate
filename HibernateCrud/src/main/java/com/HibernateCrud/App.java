package com.HibernateCrud;

import java.util.Scanner;

import com.HibernateCrud.daoimpl.StudentDaoImpl;

public class App {
	public static void main(String[] args) {
		StudentDaoImpl dao = new StudentDaoImpl();
		char c;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"PRESS 1 for add student \nPRESS 2 for display student \nPRESS 3 for Update student \nPRESS 4 for Delete student \nPRESS 5 for Fetch student");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				dao.addStudent();
				break;
			case 2:
				dao.fetchStudent();
				break;
			case 3:
				dao.updateStudent();
				break;
			case 4:
				dao.deleteStudent();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("INVALID CHOICE");
			}
			System.out.println("Do you Want to Continue ? Y/N");
			c = sc.next().charAt(0);
		} while (c == 'y' || c == 'Y');
		System.out.println("Thank You");
	}
}
