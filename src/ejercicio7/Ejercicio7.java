package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Constante para almacenar el valor de las entradas infantiles
		final double entradasInfantiles = 15.50;
		
		//Constante para almacenar el valor de las entradas adultas
		final double entradasAdultos = 20;
		
		//Constante para almacenar el valor del descuento
		final double descuentoPorcentaje = 5;
		
		//Variable para almacenar el valor del número de las entradas infantiles
		int numInfantil;
		
		//Variable para almacenar el valor del número de las entradas adultas
		int numAdulto;
		
		//Constante para almacenar la operación y el valor del precio total
		final double totalPrecio;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantás entradas infantiles desea?: ");
		numInfantil = sc.nextInt();
		
		System.out.println("¿Cuantás entradas adultas desea?: ");
		numAdulto = sc.nextInt();
		
		
		//Operación para calcular el precio total
		totalPrecio = (numInfantil * entradasInfantiles) + (numAdulto * entradasAdultos);
	
		System.out.println("El precio de las entradas es de " + totalPrecio +  " euros");			
				
		System.out.println( totalPrecio>=100 ? "Con descuento: " +  (totalPrecio*(1-(descuentoPorcentaje/100))) : "No hay descuento");
		
		//Cierre escáner
		sc.close();
		
		
	}

}
