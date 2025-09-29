package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int resto;
		int numSumar;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Di un número entero: ");
		num1 = sc.nextInt();
		System.out.println("Di otro número entero: ");
		num2 = sc.nextInt();
		
		resto = num1 % num2;
		
		numSumar = (resto == 0)? 0 : (num2-resto);	
		
		System.out.println("Hay que sumarle " + numSumar + " a " + num1 + " para que sea múltiplo de " + num2);
		
		
	}

}