import java.util.Scanner;

public class Ejercicio3 {
		public static void main(String[] ar) {
			Scanner teclado=new Scanner(System.in);
    		int pares=0;
    		int impares=0;
    		int x=0,valor;

    		while (x<10)
    			{
    			System.out.print("Ingrese un valor: ");
    			valor=teclado.nextInt();
    		if (valor%2==0)
    			{
    			pares=pares+1;
    			}
    		else
    			{
    			impares=impares+1;
    			}
    			x=x+1;
    			}
System.out.print("***Los numeros pares son "+pares+" y los impares son "+impares+"***");
	}
}