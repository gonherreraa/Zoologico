package examen14;

import java.util.ArrayList;

public class Habitat {

	private String nombre;
	private ArrayList<Animales> lista_animales;
	
	public Habitat(String nombre) {
		this.nombre=nombre;
		this.lista_animales=new ArrayList<>();
	}
	
	public void aniadir_animales(Animales nombre) {
		
		lista_animales.add(nombre);
		
	}
	
	public void eliminar_animales(Animales nombre) {
		lista_animales.remove(nombre);
	}

	public void mostrar_animales() {
		
		for (int i = 0; i < lista_animales.size(); i++) {
			System.out.println(lista_animales.get(i));
		}
	}
	
	@Override
	public String toString() {
		
		return "Habitat: " + nombre;
	}
	
	
}
