package com.learning;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsRollNo(101);
        s1.setsName("Honey");
        s1.setsAge(9);
        s1.setsAddress("Umerkot");

        //Configuration
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.learning.Student.class);
        cfg.configure();

        //Session
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        //Trnasaction
        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();

        session.close();
        sf.close();

    }
}