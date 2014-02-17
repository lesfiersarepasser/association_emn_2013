package lesfiersarepasser.assoc.bdd;

import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lesfiersarepasser.assoc.entities.Article;

import org.apache.derby.client.am.Connection;



public class DerbyConnection {
	
	private static EntityManagerFactory emf = null;
	private static EntityManager em = null;
	
	
	public static void dbConnect() {
		emf = Persistence.createEntityManagerFactory("Boss_Final_TP");
		em = emf.createEntityManager();
	}
	
	public static void find(String id) {
		
	}
	
	
	
}
