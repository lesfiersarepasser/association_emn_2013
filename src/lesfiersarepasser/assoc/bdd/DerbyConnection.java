package lesfiersarepasser.assoc.bdd;

import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lesfiersarepasser.assoc.entities.Article;

import org.apache.derby.client.am.Connection;



public class DerbyConnection {
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Boss_Final_TP");
		EntityManager em = emf.createEntityManager();
		
		
		em.find(Article.class, "REF01");
		
	}
	
	
	
}
