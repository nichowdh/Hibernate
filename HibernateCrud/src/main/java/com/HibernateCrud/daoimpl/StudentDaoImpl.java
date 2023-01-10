package com.HibernateCrud.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HibernateCrud.config.HibernateUtil;
import com.HibernateCrud.dao.StudentDao;
import com.HibernateCrud.entity.Student;

public class StudentDaoImpl implements StudentDao {
	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		String n, d, e;
		long p;
		System.out.println("Enter Name:");
		n = sc.nextLine();
		System.out.println("Enter Dept:");
		d = sc.nextLine();
		System.out.println("Enter Email:");
		e = sc.nextLine();
		System.out.println("Enter Phone");
		p = sc.nextLong();

		Student s = new Student();
		s.setName(n);
		s.setDept(d);
		s.setEmail(e);
		s.setPhone(p);

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(s);
		t.commit();
	}

	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Student std = session.get(Student.class, id);
		System.out.println("Enter the phone Number: ");
		long phone = sc.nextLong();
		std.setPhone(phone);
		session.update(std);
		System.out.println("Updated Successfully...");
		t.commit();

	}

	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Student std1 = session.get(Student.class, id);
		session.delete(std1);
		System.out.println("Deleted Successfully...");
		t.commit();

	}

	public void fetchStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Student s1 = session.get(Student.class, id);
		System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getDept() + " " + s1.getEmail() + s1.getPhone());
	}

}
