package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor de la medida 1
		double medida1;
		
		//Variable para almacenar el valor de la medida 2
		double medida2;
		
		//Variable para almacenar el valor de la medida 3
		double medida3;
		
		//Constante para almacenar la operación y el valor de los centímetros de la medida 1
		final double pasar1Centímetros;
		
		//Constante para almacenar la operación y el valor de los centímetros de la medida 3
		final double pasar3Centímetros;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la primera medida ( milímetros ): ");
		medida1 = sc.nextDouble();
		
		System.out.println("Introduce la segunda medida ( centímetros ): ");
		medida2 = sc.nextDouble();
		
		System.out.println("Introduce la tercera medida ( metros ): ");
		medida3 = sc.nextDouble();
		
		//Operación para calcular los centímetros de la medida 1
		pasar1Centímetros = medida1 / 10;
		
		//Operación para calcular los centímetros de la medida 3
		pasar3Centímetros = medida3 * 100;
		
		System.out.println("La suma de tus medidad es: " + (medida2 + pasar1Centímetros + pasar3Centímetros ));
		
		//Cierre escáner
		sc.close();
	}

}
