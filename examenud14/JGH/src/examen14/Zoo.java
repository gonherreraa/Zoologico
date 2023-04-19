package examen14;

import java.util.ArrayList;

public class Zoo {

	private ArrayList<Habitat> lista_habitat;
	private ArrayList<EmpleadosZoo>lista_empleados;
	
	public Zoo() {
		this.lista_habitat=new ArrayList<>();
		this.lista_empleados=new ArrayList<>();
	}
	
	
	public void aniadirHabitat(Habitat nombre) {
			
		lista_habitat.add(nombre);
		
	}
	
	public void eliminar_habitat(Habitat nombre) {
		if(lista_habitat.contains(nombre)) {
			lista_habitat.remove(nombre);
		}else
			System.out.println("No existe ese habitat");
	}
	
	public void aniadir_animales(Animales nombre) {
				
		for (int i = 0; i <lista_habitat.size(); i++) {
			lista_habitat.get(i).aniadir_animales(nombre);
		}
		
	}
	
	public void eliminar_animales(Animales nombre) {
		
		for (int i = 0; i <lista_habitat.size(); i++) {
		
			lista_habitat.get(i).eliminar_animales(nombre);
		}
		
	}

	public void mostrar_habitat() {
		
		for (Habitat habitat : lista_habitat) {
			System.out.println(habitat.toString());
		}
		
	}
	
	public void aniadir_empleado(EmpleadosZoo empleado) {
		lista_empleados.add(empleado);
	}
	
	public void eliminar_empleado(EmpleadosZoo empleado) {
		
		lista_empleados.remove(empleado);
	}
	
	
	public void mostrar_empleado() {
		for (int i = 0; i < lista_empleados.size(); i++) {
			System.out.println(lista_empleados.toString());
		}
		
	}

	public void mostrar_animales() {
		for (int i = 0; i < lista_habitat.size(); i++) {
			lista_habitat.get(i).mostrar_animales();
		}
	}
	
	@Override
	public String toString() {
		return "Zoo [lista_habitat=" + lista_habitat.toString() + "]";
	}
	
	
	
}
