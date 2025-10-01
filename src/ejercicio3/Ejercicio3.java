package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		//Variable para almacenar el valor del número 1
		int num1;
		
		//Variable para almacenar el valor del número 2
		int num2;
	
		//Variable para almacenar el valor del resto de la división de los dos números
		int resto;
		
		//Variable para almacenar el valor que hay que sumarle al número 1 para que sea múltiplo del número 2
		int numSumar;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Di un número entero: ");
		num1 = sc.nextInt();
		
		System.out.println("Di otro número entero: ");
		num2 = sc.nextInt();
		
		//Operación para calcular el valor del resto de la división de ambos números y almacenarlo en la variable resto
		resto = num1 % num2;
		
		//Operación ternaria para saber cuantos números hay que sumarle al número 1
		numSumar = (resto == 0)? 0 : (num2-resto);	
		
		System.out.println("Hay que sumarle " + numSumar + " a " + num1 + " para que sea múltiplo de " + num2);
		
		//Cierre escáner
		sc.close();
	}

}