package com.OneToOne.daoimpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.OneToOne.config.HibernateUtil;
import com.OneToOne.dao.CitizenDao;
import com.OneToOne.entity.Address;
import com.OneToOne.entity.Citizen;

public class CitizenDaoImpl implements CitizenDao {
	// creating instance object so we can excess globally
	Session session = HibernateUtil.activateSession();
	Transaction t = session.beginTransaction();
	Scanner sc = new Scanner(System.in);

	public void addCitizen() {
		// adding citizen properties
		Citizen c = new Citizen();
		c.setCname("Niladri");
		c.setSurname("Chowdhury");
		c.setPhone(987456321);
		c.setEmail("nil@gmail.com");
		c.setDob("01-01-1993");

		// adding address properties
		Address a = new Address();
		a.setId(1345);
		a.setIdtype("Aadhar");
		a.setAddress("Dakshinayan");
		a.setCity("Chinsurha");
		a.setState("Hooghly");
		a.setPincode(712102);

		// setting aggregation property to citizen object
		c.setAddress(a);
		session.save(c);
		System.out.println("Adding Done");
		t.commit();

	}

	public void fetchCitizen() {
		@SuppressWarnings("rawtypes")
		Query q = session.createQuery("from Citizen");

		// list with Citizen entity
		@SuppressWarnings("unchecked")
		List<Citizen> a1 = q.getResultList();

		// traverse
		Iterator<Citizen> itr = a1.iterator();
		while (itr.hasNext()) {
			Citizen c1 = itr.next();
			Address a2 = c1.getAddress();

			// output

			System.out.println("Customer Details: " + c1.getCid() + " " + c1.getCname() + " " + c1.getSurname() + " "
					+ c1.getPhone() + " " + c1.getEmail() + " " + c1.getDob());

			System.out.println("Address Details: " + a2.getId() + " " + a2.getIdtype() + " " + a2.getCity() + " "
					+ a2.getState() + " " + c1.getAddress());
		}

	}

}
