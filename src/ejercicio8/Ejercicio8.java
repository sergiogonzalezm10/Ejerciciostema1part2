package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		double metros;
		final double pasarACentimetros;
		int centimetros;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los metros alcanzados: ");
		metros = sc.nextDouble();
		pasarACentimetros = metros * 100;
		
		centimetros = (int) pasarACentimetros;
		System.out.println("Los centímetros alcanzados son : " + centimetros + " centímetros");
	}

}
