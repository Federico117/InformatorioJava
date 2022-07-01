package level03;

import java.time.LocalDate;

public class Alumno {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	
	
	public Alumno(String nombre, String apellido, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getEdad() {
		return LocalDate.now().getYear() - fechaNacimiento.getYear();
	}

	public String getNombre() {
		return nombre;
	}
	 public String getNombreApellido() {
		 return nombre+" "+apellido;
	 }


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
}
