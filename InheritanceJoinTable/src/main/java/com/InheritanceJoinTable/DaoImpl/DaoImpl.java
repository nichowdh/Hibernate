package com.InheritanceJoinTable.DaoImpl;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.InheritanceJoinTable.Dao.Dao;
import com.InheritanceJoinTable.config.HibernateUtil;
import com.InheritanceJoinTable.entity.FourWheeler;
import com.InheritanceJoinTable.entity.TwoWheels;

public class DaoImpl implements Dao {
	public void addVehicle() {
		Session session=HibernateUtil.activeSession();
		Transaction t=session.beginTransaction();
		TwoWheels tw=new TwoWheels();
		tw.setFuel("Petrol");
		tw.setEnginePower("500cc");
		tw.setSpeed(200);
		tw.setVtype("Bike");
		tw.setPrice(200000);
		tw.setModelno(1234);
		tw.setModelname("abc");
		tw.setAbs(true);
		tw.setTyretype(140);
		tw.setBtype("Sports bike");
		
		
		FourWheeler fw = new FourWheeler();
		fw.setFuel("electric");
		fw.setEnginePower("1000cc");
		fw.setSpeed(400);
		fw.setVtype("Car");
		fw.setPrice(800000);
		fw.setModelno(12345);
		fw.setModelname("Swift");
		fw.setMusicSystem(true);
		fw.setEtype("auto");
		fw.setAc(true);
		
		session.save(tw);
		session.save(fw);
		
		t.commit();
		System.out.println("Joining Done......");
	}

}
