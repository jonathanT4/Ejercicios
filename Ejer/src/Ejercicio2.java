import java.util.Scanner;

public class Ejercicio2 {
	    public static void main(String[] ar) {
	    	Scanner teclado = new Scanner(System.in);
	    	int num=0;
	    	System.out.print("Ingrese un número: ");
	    	num=teclado.nextInt();
	    	if (num<10){
	    	    System.out.print("El número ingresado tiene un dígito.");}
	    	
	    	else if(num<100){
	    		System.out.print("El número ingresado tiene dos dígitos.");
	    	 
	    	}else{
	    		System.out.print("El número ingresado tiene más de 2 dígitos.");
	    	  }
	    }
	}