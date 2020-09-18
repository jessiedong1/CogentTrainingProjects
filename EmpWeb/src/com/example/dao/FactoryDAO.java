package com.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryDAO {
	private static SessionFactory sf = null;

	
	private FactoryDAO() {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("com/example/cfg/hibernate.cfg.xml");
		this.sf= cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		
		return sf;
	}
}
