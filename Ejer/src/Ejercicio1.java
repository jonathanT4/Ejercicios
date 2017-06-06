import java.util.Scanner;

public class Ejercicio1 {
  
    public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
      	
    	int cant;
    	float val;
    	float precio;
  
    	System.out.print("Ingrese la cantidad de artículos que va a lleva: ");
    	cant=teclado.nextInt();
      
    	System.out.print("Ingrese el valor del producto: ");
    	val = teclado.nextFloat();
      	
    	precio = val * cant;
      
    	System.out.print("El total a pagar es: $");
    	System.out.print(precio);
    }
}