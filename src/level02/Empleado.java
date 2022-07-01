package level02;

public class Empleado {
	private String nomApe;
	private Integer dni;
	private int horasLabor;
	private int valorHora;
	
	public Empleado(String nomApe, Integer dni, int horasLabor, int valorHora){
		this.nomApe = nomApe;
		this.dni = dni;
		this.horasLabor = horasLabor;
		this.valorHora = valorHora;
	}

	public String getNomApe() {
		return nomApe;
	}

	public void setNomApe(String nomApe) {
		this.nomApe = nomApe;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getHorasLabor() {
		return horasLabor;
	}

	public void setHorasLabor(int horasLabor) {
		this.horasLabor = horasLabor;
	}

	public int getValorHora() {
		return valorHora;
	}

	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}
	@Override
	public String toString(){
		return "nombre: "+nomApe+"DNI:"+dni;
	}

	@Override
	public boolean equals(Object objeto) {
		if(objeto == null)return false;
		Empleado producto = (Empleado)objeto;
		if(this.getDni().equals(producto.getDni()))
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return this.getDni().hashCode();
	}
	
}
