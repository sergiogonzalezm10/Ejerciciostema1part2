package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor del identificador
		int identificador;
		
		//Variable para almacenar el valor del volumen
		int volumen;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el identificador: ");
		identificador = sc.nextInt();
		
		//Operación para calcular el volumen en el que se encuentra el identificador
		volumen = (identificador - 100) / 100 + 1;
		
		System.out.println((identificador <= 100? "El identificador tiene que ser igual o mayor que 100" : "El problema está en el volumen " + volumen));
		
		//Cierre escáner
		sc.close();
	}

}
