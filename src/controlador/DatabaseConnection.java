package controlador;
import java.sql.DriverManager;


import com.mysql.jdbc.Connection;

public class DatabaseConnection {
	
private static final String URL= "jdbc:mysql://localhost:3306/healthhub";
private static final String USSER= "root";
private static final String PASSWORD= "";

private static DatabaseConnection instace;

	public Connection connection;
		
		private DatabaseConnection() {
			try {
				connection = (Connection) DriverManager.getConnection(URL, USSER, PASSWORD);
			} catch (Exception e) {
            e.printStackTrace();
}
			
		}
		public static DatabaseConnection getInstance() {
		if (instace==null) {
			instace= new DatabaseConnection();
			
		}
		
		return instace;
		
	}
		
	public Connection getConnection() {
		return connection;
		
	}
}
