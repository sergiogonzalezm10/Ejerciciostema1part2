package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor del número entero
		int numEntero;
		
		//Variable para almacenar el valor del resto de la división
		int resto;
		
		//Variable para almacenar el valor que hay que sumarle al número para que sea múltiplo de 7
		int numSumar;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Di un número entero: ");
		numEntero = sc.nextInt();
		
		//Operación que nos da el resto de dividir el número entero entre 7 y lo almacena en la variable
		resto = numEntero % 7;
		
		//Operación ternaria que nos indica cuanto hay que sumarle al número y lo almacena en la variable
		numSumar = (resto == 0)? 0 : (7-resto);	
		
		System.out.println("Hay que sumarle " + numSumar + " para que sea múltiplo de 7");
		
		//Cierre escáner
		sc.close();
	}

}
