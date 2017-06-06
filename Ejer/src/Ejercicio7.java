
import java.util.Scanner;

public class Ejercicio7 {
Scanner teclado;
int num1,num2,sumar,restar,dividir,multiplicar;

public void ingresar(){
teclado= new Scanner(System.in);
System.out.print("Ingrese el primer numero: ");
num1=teclado.nextInt();
System.out.print("Ingrese el segundo numero: ");
num2=teclado.nextInt();
}
public void sumar(){

	sumar=num1+num2;
}
public void restar(){

	restar=num1-num2;
}
public void dividir(){

	dividir=num1/num2;
}
public void multiplicar(){
	multiplicar=num1*num2;
}
public void imprimir(){
	System.out.println("************************************************");
	System.out.println("Operaciones con sus numeros ingresados:");
	System.out.println("La SUMA de los numeros es: "+sumar);
	System.out.println("La RESTA de los numeros es: "+restar);
	System.out.println("La DIVISION de los numeros es: "+dividir);
	System.out.print("La MULTIPLICACIÓN de los numeros es: "+multiplicar);
}
public static void main(String[]ar){
	Ejercicio7 operaciones1;
	operaciones1=new Ejercicio7();
	operaciones1.ingresar();
	operaciones1.sumar();
	operaciones1.restar();
	operaciones1.dividir();
	operaciones1.multiplicar();
	operaciones1.imprimir();
}
}