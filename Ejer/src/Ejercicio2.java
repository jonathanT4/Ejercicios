import java.util.Scanner;

public class Ejercicio2 {
	    public static void main(String[] ar) {
	    	Scanner teclado = new Scanner(System.in);
	    	int num=0;
	    	System.out.print("Ingrese un n�mero: ");
	    	num=teclado.nextInt();
	    	if (num<10){
	    	    System.out.print("El n�mero ingresado tiene un d�gito.");}
	    	
	    	else if(num<100){
	    		System.out.print("El n�mero ingresado tiene dos d�gitos.");
	    	 
	    	}else{
	    		System.out.print("El n�mero ingresado tiene m�s de 2 d�gitos.");
	    	  }
	    }
	}