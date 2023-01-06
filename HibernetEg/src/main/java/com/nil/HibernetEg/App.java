package com.nil.HibernetEg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// configureation -activation hibernaet framework
		// configure -read both cfg files and mapping detils
		// build SeassionFactory -from cfg object it takes jdbc info.and jdbc connection
		SessionFactory s = new Configuration().configure().buildSessionFactory();
//opens an connection with db and session object perform CRUD
		Session ses = s.openSession();
// operation performed in db,save permanent
		Transaction t = ses.beginTransaction();
//create object of persistance class
		Student s1 = new Student();
//use object to enter data in table setter method
		s1.setStu_id(101);
		s1.setStu_FirstName("Niladri");
		s1.setStu_LastName("Chowdhury");
		s1.setStu_Email("nil@hotmail.com");
		s1.setStu_Add("Chinsurah");
		s1.setStu_fee(5000.50);
		s1.setStu_phone(90356985);
		// session object is used to save the persistance onject
		ses.save(s1);
		// transaction object to commit changes
		t.commit();
		// close the session
		ses.close();
	}
}
