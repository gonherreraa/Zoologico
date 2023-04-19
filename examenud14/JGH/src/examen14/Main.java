package examen14;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

public static Scanner sc = new Scanner(System.in);	
	public static void main(String[] args) throws Excepciones_menu {
		Zoo mizoo = new Zoo();
		
		acceso(mizoo);

	}

	public static int menu() throws InputMismatchException,Excepciones_menu{
		
		System.out.println("***BIENVENIDO AL ZOOLOGICO***");
		System.out.println("1. Agregar animales del zoológico");
		System.out.println("2. Eliminar animales del zoológico");
		System.out.println("3. Agregar hábitats del zoológico");
		System.out.println("4. Eliminar habitats del zoológico");
		System.out.println("5. Agregar cuidadores al zoológico");
		System.out.println("6. Eliminar cuidadores del zoológico");
		System.out.println("7. Asignar animales a hábitats específicos");
		System.out.println("8. Asignar cuidadores a animales específicos");
		System.out.println("9. Mostrar información detallada de cada animal, hábitat y cuidador");
		System.out.println("10. Mostrar los animales del zoo ordenados por edad");
		System.out.println("11. Salir");
		int opc = sc.nextInt();
		
		return opc;
	}
	
	public static void acceso(Zoo mizoo) throws Excepciones_menu,InputMismatchException{
		int opcion = 0;
		boolean continua = true;

		while(opcion!=11) {
			
			try {
				opcion=menu();
				if(opcion==0) {
					Excepciones_menu miExcepcion = new Excepciones_menu("No se puede introducir el 0");
					throw miExcepcion;
				}
				}catch (InputMismatchException e) {
					System.out.println("Introduce solo numeros");
					sc.nextLine();
					continua=false;
				}catch(Excepciones_menu e) {
					System.out.println(e.getMessage());
					sc.nextLine();
					continua=false;
					
				}
			
			switch (opcion) {
			case 1: {
				
				do {
					try {
						System.out.println("Nombre");
						sc.nextLine();
						String nom= sc.nextLine();
						System.out.println("Genero");
						String gen= sc.nextLine();
						System.out.println("Especie");
						String esp= sc.nextLine();
						System.out.println("Edad");
						int edad= sc.nextInt();
						System.out.println("Habitat:");
						String nombre =sc.next();
						Habitat habitat = new Habitat(nombre);
						mizoo.aniadirHabitat(habitat);
						Animales animal = new Animales(nom,gen,esp,edad,habitat);
						mizoo.aniadir_animales(animal);
									
					}catch(InputMismatchException e) {
						System.out.println("Dato incorrecto");
						sc.nextLine();
						continua=false;
					}
			}while(continua);
					
				
			
			}break;
			case 2: {
				do {
					try {
				
						System.out.println("Nombre");
						String nom= sc.nextLine();
						Animales animal = new Animales(nom);
						mizoo.eliminar_animales(animal);	
				
					}catch(InputMismatchException e) {
						System.out.println("Dato incorrecto");
						sc.nextLine();
						continua=false;
					}
			}while(continua);
							
			}break;
			case 3: {
				do {
					try {
				
						System.out.println("Nombre del habitat");
						String nombre = sc.next();
						Habitat habitat = new Habitat(nombre);
						
						mizoo.aniadirHabitat(habitat);
				
			}catch(InputMismatchException e) {
				System.out.println("Dato incorrecto");
				sc.nextLine();
				continua=false;
			}
			}while(continua);
				
			}break;
			case 4: {
				do {
					try {
							System.out.println("Habitat:");
							mizoo.mostrar_habitat();
							System.out.println("Nombre del habitat");
							String nombre = sc.next();
							Habitat habitat = new Habitat(nombre);
							mizoo.aniadirHabitat(habitat);
					}catch(InputMismatchException e) {
						System.out.println("Dato incorrecto");
						sc.nextLine();
						continua=false;
					}
					}while(continua);
				
			}break;
			case 5: {
				do {
					try {	
			
						System.out.println("Id empleado:");
						int id = sc.nextInt();
						System.out.println("Nombre:");
						String nombre = sc.next();
						System.out.println("Apellido:");
						String apell = sc.next();
						System.out.println("Salario:");
						double sal = sc.nextDouble();
						EmpleadosZoo empleado = new EmpleadosZoo(id,nombre,apell,sal);
						mizoo.aniadir_empleado(empleado);
				
					}catch(InputMismatchException e) {
						System.out.println("Dato incorrecto");
						sc.nextLine();
						continua=false;
					}
					}while(continua);
			}break;
			case 6: {
				
				do {
					try {
						System.out.println("Id empleado:");
						int id = sc.nextInt();
						EmpleadosZoo empleado = new EmpleadosZoo(id);
						mizoo.eliminar_empleado(empleado);
				
					}catch(InputMismatchException e) {
						System.out.println("Dato incorrecto");
						sc.nextLine();
						continua=false;
					}
					
				}while(continua);
				
			}break;
			case 7: {
				
				
			}break;
			case 8: {
						
						
			}break;
			case 9: {
				
				mizoo.mostrar_animales();
				mizoo.mostrar_empleado();
				mizoo.mostrar_habitat();
				
			}break;
			case 10: {
				
				
			}break;
			case 11: {
				System.out.println("Hasta pronto");
				System.exit(0);
				
			}break;
			default:
				System.out.println("Opcion no valida. Escoge una opcion entre el 1-11");
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
