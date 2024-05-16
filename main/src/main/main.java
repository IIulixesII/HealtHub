package main;


import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;



public class main {

    
    public static void main(String[] args) {
    	
    	Conexion con= new Conexion();
    	
    	Connection Conexion = con.conectar();
    	
 
    	
    	
    	
    	
		String [] Opciones= {"entrar como admin","entrar como doctor","Salir"};

	String Opcion;
		
		do {
			Opcion=(String)JOptionPane.showInputDialog(null,"Que desea hacer?","",JOptionPane.DEFAULT_OPTION,null,Opciones,Opciones[0]);
			
			switch (Opcion) {
			
			case "entrar como admin":
				
				String [] Opcioness= {"registrar paciente","ordenar gravedad","Salir"};

				String Opcionn;
				do {
					Opcionn=(String)JOptionPane.showInputDialog(null,"Que desea hacer?","",JOptionPane.DEFAULT_OPTION,null,Opcioness,Opcioness[0]);

				switch (Opcionn) {
				case "registrar paciente":
					
					break;
	            case "ordenar gravedad":
					
					break;
		

				default:
					break;
				}
				
				
				} while (!Opcionn.equalsIgnoreCase("Salir"));

		
				
				break;
			case "entrar como doctor":
				
				String [] Opcionesss= {"Cirujias","Guardia","Grave","Salir"};

				String Opcionnn;
				do {
					Opcionn=(String)JOptionPane.showInputDialog(null,"Que desea hacer?","",JOptionPane.DEFAULT_OPTION,null,Opcionesss,Opcionesss[0]);

				switch (Opcionn) {
				case "Cirujias":
					break;
	            case "Guardia":
					
					break;
                case "Grave":
					
					break;
		

		

				default:
					break;
				}
				
				
				} while (!Opcionn.equalsIgnoreCase("Salir"));
				break;
			
		
			}
			
		} while (!Opcion.equalsIgnoreCase("Salir"));
		
	
}}