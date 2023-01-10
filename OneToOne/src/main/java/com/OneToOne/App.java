package com.OneToOne;

import com.OneToOne.dao.CitizenDao;
import com.OneToOne.daoimpl.CitizenDaoImpl;

public class App {
	public static void main(String[] args) {
		CitizenDao dao = new CitizenDaoImpl();
		// adding citizen to db
		dao.addCitizen();
		// getting citigen from db
		dao.fetchCitizen();
	}
}
