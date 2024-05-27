package Modelos;
import java.util.ArrayList;
import java.util.List;

public class pacientes {

	private int edad;
	private int gravedad;
	private String Nombre;
	
	public pacientes(){}

	

	
	
	
	
	
	public pacientes(int edad, int gravedad, String nombre) {
		this.edad = edad;
		this.gravedad = gravedad;
		Nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getGravedad() {
		return gravedad;
	}

	public void setGravedad(int gravedad) {
		this.gravedad = gravedad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	

	
	
	

	
}
