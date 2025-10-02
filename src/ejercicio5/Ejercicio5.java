package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor de los segundos
		double seg;
		
		//Constante para almacenar la operación y el valor de las horas
		final double HORAS;
		
		//Constante para almacenar la operación y el valor de los minutos
		final double MINUTOS;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los segundos: ");
		seg = sc.nextDouble();
		
		//Operación para calcular los segundos
		HORAS = seg / 3600;
		
		//Operación para calcular los minutos
		MINUTOS = seg / 60;
		System.out.println("Hay: " + HORAS + " horas o " + MINUTOS + " minutos" + " en esos segundos");

		
		//Cierre escáner
		sc.close();
	}

}
