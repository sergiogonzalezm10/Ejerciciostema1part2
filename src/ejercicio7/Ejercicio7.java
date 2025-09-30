package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		final double entradasInfantiles = 15.50;
		final double entradasAdultos = 20;
		final double descuentoPorcentaje = 5;
		int numInfantil;
		int numAdulto;
		final double totalPrecio;
		double descuento;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantás entradas infantiles desea?: ");
		numInfantil = sc.nextInt();
		
		System.out.println("¿Cuantás entradas adultas desea?: ");
		numAdulto = sc.nextInt();
		
		totalPrecio = (numInfantil * entradasInfantiles) + (numAdulto * entradasAdultos);
		System.out.println("El precio de las entradas es de " + totalPrecio +  " euros");			
				
		System.out.println( totalPrecio>=100 ? "Con descuento: " +  (totalPrecio*(1-(descuentoPorcentaje/100))) : "No hay descuento");
		sc.close();
	}

}
