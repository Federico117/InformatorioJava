package level02;


public class Empleado {
	private String nomApe;
	private int dni;
	private int horasTrabajadas;
	private int valorHora;
	
	public Empleado(String nomApe, int dni, int horasTrabajadas, int valorHora){
		this.nomApe = nomApe;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.valorHora = valorHora;
	}
	
	public String getNomApe(){
		return nomApe;
	}
	
	public int getDni(){
		return dni;
	}
	
	public int getHorasTrabajadas(){
		return horasTrabajadas;
	}
	
	public int getValorHora(){
		return valorHora;
	}
}
