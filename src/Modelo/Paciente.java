package Modelo;

public class Paciente {
	private int id;
	private String nombre;
	private int dni;
	
	
	public Paciente(int id, String nombre, int dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dni = dni;
	}
	public Paciente(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", dni=" + dni + "]";
	}
	public boolean iniciarSesion(String nombre, int dni) {
	    if (nombre.length() < 8) {
	        return false;
	    }
	    
	    if (dni < 10000000) {
	        return false;
	    }
	    
	    if (this.getDni() == dni && this.getNombre().equals(nombre)) {
	        return true;
	    } else {
	        return false;
	    }
	}

	}
	

