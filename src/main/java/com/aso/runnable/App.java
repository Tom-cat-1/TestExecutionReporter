package com.aso.runnable;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aso.entity.TestSuite;
import com.aso.entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User asif=new User();
        asif.setId(1001);
        asif.setName("Asif K Mallick");
        asif.setRole("Admin");
        asif.setSince(new Date());
        
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        
        Transaction tx = session.beginTransaction();

        session.save(asif);
        
        tx.commit();

        
    }
}
