package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Variable para almacenar el año
		int año;
		
		//Variable para almacenar el siglo
		int siglo;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica un año: ");
		año = sc.nextInt();
		
		//Operación para calcular el siglo en el que se encuentra el año
		siglo = ( año + 99) / 100;
		
		System.out.println("El año " + año + " pertenece al siglo " + siglo);
		
		//Cierre escáner
		sc.close();

	}

}
