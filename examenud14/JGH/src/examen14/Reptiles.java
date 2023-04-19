package examen14;

public class Reptiles extends Animales{

	private String color;
	
	public Reptiles(String nombre, String genero, String especie, int edad, String color,EmpleadosZoo empleado,Habitat habitat) {
		super(nombre, genero, especie, edad,empleado,habitat);
		this.color=color;
	}

}
