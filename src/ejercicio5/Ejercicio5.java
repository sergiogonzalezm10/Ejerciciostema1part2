package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		double seg;
		final double HORAS;
		final double MINUTOS;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los segundos: ");
		seg = sc.nextDouble();
		
		HORAS = seg / 3600;
		MINUTOS = seg / 60;
		System.out.println("Hay: " + HORAS + " horas o " + MINUTOS + " minutos" + " en esos segundos");

		sc.close();
	}

}
