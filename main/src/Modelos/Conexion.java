package Modelos;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

public class Conexion {

	Connection con;
	
	public Connection conectar(){
		
		try {
			con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/healthhub","root","");
			JOptionPane.showConfirmDialog(null, "se conecto");
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "no se conecto");

		}
		
		return con;
		
	}
}