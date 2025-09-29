package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		double x;
		double a;
		double b;
		double c;
		double y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor x: ");
		x = sc.nextDouble();
		System.out.println("Valor a: ");
		a = sc.nextDouble();
		System.out.println("Valor b: ");
		b = sc.nextDouble();
		System.out.println("Valor c: ");
		c = sc.nextDouble();
		
		y = a * x * x + b * x + c;
		
		System.out.println("El valor de y es: " + y);
		c = sc.nextDouble();
	}

}
