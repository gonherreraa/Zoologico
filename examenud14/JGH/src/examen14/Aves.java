package examen14;

public class Aves extends Animales{

	private double longitudPico;
	private boolean rapaces;
	
	public Aves(String nombre, String genero, String especie, int edad,double longitudPico,boolean rapaces,EmpleadosZoo empleado,Habitat habitat) {
		super(nombre, genero, especie, edad,empleado,habitat);
		this.longitudPico=longitudPico;
		this.rapaces=rapaces;
	}

}
