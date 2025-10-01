package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor del número
		double numEntero;
		
		//Variable para almacenar el valor del número sin los decimales
		int numeroSinDecimales;
		
		//Variable para almacenar el valor de los decimales del número
		double numeroDecimales;
		
		//Boolean para devolver true o false, según el valor del número con los decimales
		boolean numeroConDecimales;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Di un número con decimales: ");
		
		//Lee el número entero escrito y lo almacena en la variable correspondiente
		numEntero = sc.nextDouble(); 
		
		
		//Nos muestra la parte sin decimales del número gracias a int
		numeroSinDecimales = (int) numEntero;
		
		//Operación para calcular los decimales del número
		numeroDecimales = numEntero - numeroSinDecimales;
		
		//Compara los decimales con 0.5 , para saber si es mayor o igual que este y darnos, true o false
		numeroConDecimales = numeroDecimales >= 0.5;
				
		System.out.println("El número entero redondeado es: " + (numeroConDecimales ? (++numeroSinDecimales) : numeroSinDecimales));
		
		//Cierre escáner
		sc.close();
		
	}

}
