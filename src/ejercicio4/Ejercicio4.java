package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor de "x"
		double x;
		
		//Variable para almacenar el valor de "a"
		double a;
		
		//Variable para almacenar el valor de "b"
		double b;
		
		//Variable para almacenar el valor de "c"
		double c;
		
		//Constante para almacenar la operación para calcular "y" y su valor 
		final double y;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor x: ");
		x = sc.nextDouble();
		System.out.println("Valor a: ");
		a = sc.nextDouble();
		System.out.println("Valor b: ");
		b = sc.nextDouble();
		System.out.println("Valor c: ");
		c = sc.nextDouble();
		
		//Operación para calcular el valor de "y"
		y = a * x * x + b * x + c;
		
		System.out.println("El valor de y es: " + y);
		c = sc.nextDouble();
		
		//Cierre escáner
		sc.close();
	}

}
