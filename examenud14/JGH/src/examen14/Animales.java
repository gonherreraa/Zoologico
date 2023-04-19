package examen14;

public class Animales {

	private String nombre;
	private String genero;
	private String especie;
	private int edad;
	private EmpleadosZoo empleado;
	private Habitat habitat;
	
	
	public Animales(String nombre) {
		this.nombre=nombre;
	}
	
	public Animales(String nombre,String genero,String especie,int edad,Habitat habitat) {
		this.nombre = nombre;
		this.genero = genero;
		this.especie = especie;
		this.edad = edad;
		this.habitat=habitat;
	}
	
	
	public Animales(String nombre, String genero, String especie, int edad,EmpleadosZoo empleado,Habitat habitat) {
		
		this.nombre = nombre;
		this.genero = genero;
		this.especie = especie;
		this.edad = edad;
		this.empleado=empleado;
		this.habitat=habitat;
		
	}



	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", genero=" + genero + ", especie=" + especie + ", edad=" + edad;
	}


	
	
}
