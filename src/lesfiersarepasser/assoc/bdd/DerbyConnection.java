package lesfiersarepasser.assoc.bdd;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lesfiersarepasser.assoc.bean.Utilisateur;

import org.apache.derby.client.am.Connection;



public class DerbyConnection {
	
	static String connectionURL = "jdbc:derby://localhost:1527/db_assoc"; 
	static Connection conn = null;
	
	
	public static void dbConnect() {
		
		try {
			conn = (Connection) DriverManager.getConnection(connectionURL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void dbDisconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Utilisateur connectUser(String login, String password) {
		dbConnect();
		Utilisateur vreturn = null;
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from Utilisateur where LOGIN = '" + login + "'");
			while(rs.next()) {
				if(password.equals(rs.getString("PASSWORD"))) {
					vreturn = new Utilisateur(rs.getInt("ID"), 
							rs.getString("LOGIN"), 
							rs.getString("PASSWORD"), 
							rs.getString("NOM"), 
							rs.getString("PRENOM"), 
							rs.getString("ADRESSE"), 
							rs.getString("CODEPOSTAL"), 
							rs.getInt("IDPAYS"));
				}
			}
		} catch (SQLException e) {
			vreturn = null;
			e.printStackTrace();
		}
		
		return vreturn;
		
	}
	
	public static void find(String id) {
		
	}
	
	
	
	
	
}
