package examen14;

public class EmpleadosZoo implements Cuidador{

	private int id_empleado;
	private String nombre;
	private String apellido;
	private double salario;
	
	public EmpleadosZoo(int id) {
		this.id_empleado=id;
	}
	
	
	public EmpleadosZoo(int id_empleado,String nombre,String apellido,double salario) {
		this.id_empleado=id_empleado;
		this.nombre=nombre;
		this.apellido=apellido;
		this.salario=salario;
	}
	
	
	@Override
	public void alimentar(double cantidad) {
		
		System.out.println("La cantidad de alimento es de " + cantidad);
		
	}


	@Override
	public String toString() {
		return "EmpleadosZoo: id_empleado:" + id_empleado + ", nombre:" + nombre + ", apellido:" + apellido
				+ ", salario:" + salario + "]";
	}

	
}
