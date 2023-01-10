package com.OneToOne.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//creating session method within the Hibernateutiol class
public class HibernateUtil { // utiol calss
	public static Session activateSession() { // creating and returning session method
		SessionFactory sfactory = new Configuration().configure().buildSessionFactory();
		Session session = sfactory.openSession();
		return session; // returning the session

	}

}
