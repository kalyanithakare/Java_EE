package mypack;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class main {
	

	public static void main(String[] args) 
	{
		
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction transaction=null;
	try{
     transaction=session.beginTransaction();
	Student1 s1=new Student1();
	s1.setName("kalyani");
	s1.setAge(23);
	s1.setAddress("mumbai");
	session.save(s1);
	transaction.commit();
	System.out.println("Record Stored");
	session.close();
	}
	catch(Exception ee)
	{
		ee.printStackTrace();
	}	
	}
}

	
