package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double numEntero;
		int numeroSinDecimales;
		double numeroDecimales;
		boolean numeroConDecimales;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Di un número con decimales: ");
		numEntero = sc.nextDouble(); 
		
		numeroSinDecimales = (int) numEntero;
		
		numeroDecimales = numEntero - numeroSinDecimales;
	
		numeroConDecimales = numeroDecimales >= 0.5;
				
		System.out.println("El número entero redondeado es: " + (numeroConDecimales ? (++numeroSinDecimales) : numeroSinDecimales));
		

	}

}
