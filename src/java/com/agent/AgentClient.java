package com.agent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AgentClient {
     public static void main(String as[]){
        Configuration cfg = new Configuration();
        cfg.configure();
        //get session factory
        SessionFactory sf=cfg.buildSessionFactory();
        
        //get session object
        Session s =sf.openSession();
        
        //create emp class object
        Agent emp = new Agent(1, "jay", 007,03);
        Agent emp1 = new Agent(2, "shail", 8,6);
        
        s.save(emp1);
        
        //start transaction
        Transaction tx = s.beginTransaction();
        tx.commit();
        
        //close session and sessionFactory
        s.close();
        sf.close();
        System.out.println("Operation Sucessfull");
     }
}