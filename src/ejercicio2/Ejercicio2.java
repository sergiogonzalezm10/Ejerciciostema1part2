package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numEntero;
		int resto;
		int numSumar;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Di un número entero: ");
		numEntero = sc.nextInt();
		
		resto = numEntero % 7;
		
		numSumar = (resto == 0)? 0 : (7-resto);	
		
		System.out.println("Hay que sumarle " + numSumar + " para que sea múltiplo de 7");
		
		sc.close();
	}

}
