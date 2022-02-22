package com;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
    	com.Employee emp=new Employee();
        try
        {
                SessionFactory factory=new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
                Session session=factory.getCurrentSession();
                session.beginTransaction();

                emp.setKeyOne(10);
                session.save(emp);

                session.getTransaction().commit();
                session.close();
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }

    	
    }
}
