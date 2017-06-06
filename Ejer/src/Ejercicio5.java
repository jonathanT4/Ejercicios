import java.util.Scanner;

public class Ejercicio5 {
	
    public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	string guarda[];
    	int n=0,aux,total;
  
    	do{
    		System.out.print("Ingrese un numero:");
    		guarda=teclado.nextInt();
    			if(guarda!=9999){
    			total += aux;
    			} while(aux!=9999);{
    	         
    			for(n=1;n<=2;n++){
    				total= total  + guarda[n];
    			}
    			System.out.print("La acumulacion es:"+total);
  	}
  }
 }
}