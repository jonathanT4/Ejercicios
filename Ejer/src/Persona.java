import java.util.Scanner;

public class Persona {
	Scanner teclado;
	String nombre;
	int edad;
	
	public static void main(String[]ar){
		Empleado empleado1=new Empleado();
		empleado1.Datos();
		empleado1.DatosEmp();
		empleado1.Persona();
		empleado1.Empleados();
	}
	
	public Persona(){
		teclado=new Scanner(System.in);
	}
	
	public void Datos(){

		System.out.print("Ingrese su nombre: ");
		nombre=teclado.nextLine();
		System.out.print("Ingrese su edad: ");
		edad=teclado.nextInt();

	}

	 public void Persona(){
		System.out.println("********************************************************");
		System.out.print("El nombre ingresado es: "+nombre+"\n");
		System.out.print("La edad ingresada es: "+edad+"\n");
	}
}


class Empleado extends Persona {
	protected int sueldo;
	public void DatosEmp(){
		System.out.print("Ingrese su sueldo: ");
		sueldo=teclado.nextInt();
		}
	public void Empleados(){
		System.out.print("El sueldo ingresado es: "+sueldo);
	}

}