package examen14;

public class Mamifero extends Animales{

	private String desplazamiento;
	
	public Mamifero(String nombre, String genero, String especie, int edad,String desplazamiento,EmpleadosZoo empleado,Habitat habitat) {
		super(nombre, genero, especie, edad,empleado,habitat);
		this.desplazamiento=desplazamiento;
	}

	
}
