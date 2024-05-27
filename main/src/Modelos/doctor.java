package Modelos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class doctor {
	
	private int edad;
	private int dni;
	private boolean disponible;
	private LocalDate citas;
	private String Nombre;
	
	
	doctor(){}
	
	public doctor(int edad, int dni, boolean disponible, LocalDate citas, String nombre) {
		this.edad = edad;
		this.dni = dni;
		this.disponible = disponible;
		this.citas = citas;
		Nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public LocalDate getCitas() {
		return citas;
	}

	public void setCitas(LocalDate citas) {
		this.citas = citas;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public void verpacientesciru() {
		{
			List<pacientes>lista= new ArrayList<pacientes>();
			lista.add(new pacientes(12, 3, "sack"));
			lista.add(new pacientes(12, 1, "jose"));
			lista.add(new pacientes(12, 3, "mati"));
			lista.add(new pacientes(12, 2, "jose"));


			
			 for (pacientes paciente : lista) {
		            if (paciente.getGravedad() == 3) {
		                JOptionPane.showMessageDialog(null, "El paciente es: " + paciente.getNombre());
		            }
		        }
	}
	}
}
