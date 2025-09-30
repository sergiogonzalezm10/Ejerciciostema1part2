package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		double medida1;
		double medida2;
		double medida3;
		final double pasar1Centímetros;
		final double pasar3Centímetros;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la primera medida ( milímetros ): ");
		medida1 = sc.nextDouble();
		
		System.out.println("Introduce la segunda medida ( centímetros ): ");
		medida2 = sc.nextDouble();
		
		System.out.println("Introduce la tercera medida ( metros ): ");
		medida3 = sc.nextDouble();
		
		pasar1Centímetros = medida1 / 10;
		pasar3Centímetros = medida3 * 100;
		
		System.out.println("La suma de tus medidad es: " + (medida2 + pasar1Centímetros + pasar3Centímetros ));
		
		sc.close();
	}

}
