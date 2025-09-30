package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int año;
		int siglo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica un año: ");
		año = sc.nextInt();
		
		siglo = ( año + 99) / 100;
		
		System.out.println("El año " + año + " pertenece al siglo " + siglo);
		
		sc.close();

	}

}
