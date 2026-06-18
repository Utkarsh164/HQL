package com.hqlPrac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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
		Laptop std = session.find(Laptop.class, 2);
		System.out.println("IBMer hql : " + std);
		session.close();
		sf.close();
	}

}
