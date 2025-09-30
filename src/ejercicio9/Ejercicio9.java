package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int identificador;
		int volumen;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el identificador: ");
		identificador = sc.nextInt();
		
		volumen = (identificador - 100) / 100 + 1;
		System.out.println((identificador <= 100? "El identificador tiene que ser igual o mayor que 100" : "El problema está en el volumen " + volumen));
		
		sc.close();
	}

}
