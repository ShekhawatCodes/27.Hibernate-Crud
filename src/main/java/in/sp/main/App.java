package in.sp.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.sp.entities.User;

public class App 
{
    public static void main( String[] args )
    {
    	
//    	User user1 = new User();
//
//    	user1.setName("Sumroo");
//    	user1.setEmail("sumit@gmail.com");
//    	user1.setPassword("sumoo123");
//    	user1.setGender("male");
//    	user1.setCity("bikaner");
    	
//    	User user2 = new User();
//    	user2.setName("vinroo");
//    	user2.setEmail("vineet@gmail.com");
//    	user2.setPassword("vinroo123");
//    	user2.setGender("male");
//    	user2.setCity("jaipur");
    	
    	
        Configuration cfg = new Configuration();
        cfg.configure("/in/sp/config/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
     
        
        //-----------INSERT OPERATION--------------
//        try {
//        	   session.save(user2);
//               transaction.commit();
//               System.out.println("USER DETAILS ADDED SUCCESFULLY");
//        }
//        catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			System.out.println("USER DETAILS NOT ADDED DUE TO SOME ERROR");
//		}
        
        
        //----------SELECT OPERATION-----------------
        
//        try {
//        	User user = session.get(User.class, 3L);
//        	
//        	if(user != null) {
//        	System.out.println(user.getId());
//        	System.out.println(user.getName());
//        	System.out.println(user.getEmail());
//        	System.out.println(user.getPassword());
//        	System.out.println(user.getGender());
//        	System.out.println(user.getCity());
//        	}
//        	else
//        	{
//        		System.out.println("USER NOT FOUND");
//        	}
//        }
//        catch (Exception e) {
//			e.printStackTrace();
//		}
        
   //     -----------UPDATE OPERATION--------------

    	
//      try {
//    	  User user = session.get(User.class, 2L);
//      	user.setCity("anadamannicobar");
//    	  
//      	   session.saveOrUpdate(user);
//             transaction.commit();
//             System.out.println("USER DETAILS UPDATED SUCCESFULLY");
//      }
//      catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			System.out.println("USER DETAILS NOT UPDATED DUE TO SOME ERROR");
//		}
        
        
   //     -----------DELETE OPERATION--------------

    	
      try {
    	  User user = new User();
    	  user.setId(2L);
    	  
      	   session.delete(user);
             transaction.commit();
             System.out.println("USER DETAILS DELETED SUCCESFULLY");
      }
      catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			System.out.println("USER DETAILS NOT DELETED DUE TO SOME ERROR");
		}
      
        
        
    }
}
