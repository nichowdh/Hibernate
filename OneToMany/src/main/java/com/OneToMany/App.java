package com.OneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.OneToMany.entity.Cart;
import com.OneToMany.entity.Item;

public class App {
	public static void main(String[] args) {
		SessionFactory sfactory = new Configuration().configure().buildSessionFactory();
		Session session = sfactory.openSession();
		Transaction t = session.beginTransaction();

		Item i = new Item();
		i.setItemname("Phone");
		i.setPrice(23000);
		i.setQuantity(1);

		Item i1 = new Item();
		i1.setItemname("Bottles");
		i1.setPrice(2000);
		i1.setQuantity(3);

		Item i2 = new Item();
		i2.setItemname("Jeans");
		i2.setPrice(3000);
		i2.setQuantity(2);

		Item i3 = new Item();
		i3.setItemname("Bags");
		i3.setPrice(2300);
		i3.setQuantity(1);

		Item i4 = new Item();
		i4.setItemname("Watches");
		i4.setPrice(5000);
		i4.setQuantity(1);

		ArrayList<Item> a1 = new ArrayList<Item>();
		a1.add(i);
		a1.add(i1);
		a1.add(i2);
		a1.add(i3);
		a1.add(i4);

		Cart c = new Cart();
		c.setName("Niladri");
		c.setItem(a1);
		session.save(c);
		t.commit();
		System.out.println("Inserted");

	}
}
