package com.TicketBookingManagement.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.TicketBookingManagement.config.TicketUtil;
import com.TicketBookingManagement.dao.TicketDao;
import com.TicketBookingManagement.entity.Ticket;

//implementation class for tickets
public class TicketDaoImpl implements TicketDao {

	public void createPasenger() {// open Pasenger details in db
		Scanner sc = new Scanner(System.in);
		// local variables
		long phone;
		String fname, lname, state, booking_date, train, s_point, e_point;
		System.out.println("_____Enter the Details to Book Ticket______");

		System.out.println("Enter First Name:");
		fname = sc.next();
		System.out.println("Enter Last Name:");
		lname = sc.next();
		System.out.println("Enter State: ");
		state = sc.next();
		System.out.println("Enter Date:");
		booking_date = sc.next();
		System.out.println("Enter Your Phone Number:");
		phone = sc.nextLong();
		System.out.println("Enter Train Name:");
		train = sc.next();
		System.out.println("Enter Source Platform:");
		s_point = sc.next();
		System.out.println("Enter Destination Platform:");
		e_point = sc.next();
		System.err.println("Details inserted & saved successfully------------------");

		Ticket tc = new Ticket();
		tc.setFname(fname);
		tc.setLname(lname);
		tc.setState(state);
		tc.setBooking_date(booking_date);
		tc.setPhone(phone);
		tc.setTrain(train);
		tc.setS_point(s_point);
		tc.setE_point(e_point);

		Session session = TicketUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(tc);
		t.commit();

	}

	public void fetchPasenger() {// fetch pasenger details from db
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String fname = sc.next();
		System.out.println("Enter Last Name:");
		String lname = sc.next();
		System.out.println("Enter Phone Number:");
		long phone = sc.nextLong();
		Session session = TicketUtil.getSessionFactory().openSession();
		Ticket tc1 = session.get(Ticket.class, fname);
		System.out.println("___Details of your Ticket___");
		System.out.println(tc1.getFname() + " " + tc1.getLname() + " " + tc1.getState() + " " + tc1.getBooking_date()
				+ " " + tc1.getPhone() + " " + tc1.getTrain() + " " + tc1.getS_point() + " " + tc1.getE_point());
		System.err.println("________________________________________");
	}

}
