package com.hqlPrac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hqlPrac.Laptop;
import com.hqlPrac.Student;

import java.util.ArrayList;
import java.util.List;

public class Hql1Application {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().addAnnotatedClass(Laptop.class).configure().buildSessionFactory();
		Session session = sf.openSession();

		//Query query = session.createQuery("from Laptop where lModal='Lenovo'", Laptop.class);
		
		//For external parameter so that we do not have to get caut up in that quets issue
		String brand="Lenovo";
		Query query = session.createQuery("from Laptop where lModal=?1", Laptop.class);
		
		//in case we want to use anything other than select *
		//Query query = session.createQuery("select lPrice from Laptop where lModal=?1", Laptop.class);
		
		query.setParameter(1,brand);
		List<Laptop> lap = query.getResultList();
		
		//Eager Loading
		// Laptop std = session.find(Laptop.class, 2);
		
		//Lazy Loading
		Laptop std=session.byId(Laptop.class).getReference(2);
		System.out.println("IBMer hql : " + lap);
		session.close();
		sf.close();
	}

}
