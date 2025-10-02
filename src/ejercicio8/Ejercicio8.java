package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor de los metros
		double metros;
		
		//Constante para almacenar la operación y el valor de los centímetros 
		final double pasarACentimetros;
		
		//Variable para almacenar el valor de los centímetros
		int centimetros;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los metros alcanzados: ");
		metros = sc.nextDouble();
		
		//Operación para pasar de metros a centímetros
		pasarACentimetros = metros * 100;
		
		//Operación para mostrar solo la parte entera de los centímetros
		centimetros = (int) pasarACentimetros;
		
		System.out.println("Los centímetros alcanzados son : " + centimetros + " centímetros");
		
		//Cierre escáner
		sc.close();
	}

}
