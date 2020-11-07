package Ejercicio1;
import Ejercicio1.Circulo;

import java.util.Scanner;

public class mainEjercicio1 {

	public static void main(String[] args) {
		
		int inX, inY, inR, inD = 0;
		Circulo c;
		Scanner in;
					
			// Create scanner
			in = new Scanner(System.in);
			
			// Enter x
			System.out.print("Coordenada x: ");
			inX = in.nextInt();
			
			// Enter y
			System.out.print("Coordenada y: ");
			inY = in.nextInt();
			
			// Enter radius
			System.out.print("Radio: ");
			inR= in.nextInt();

			// Create the object!
			c = new Circulo(inX, inY, inR);
			
			// Print info and read data
			System.out.println("El área del " + c + " es " + c.area(inD));			
			System.out.print("Desplazamiento: ");			
			inD = in.nextInt();			
			
			// Moving the circle
			c.traslada(inD);
			
			// Printing more info...
			System.out.println("Resultado: " + c);
			
			in.close();
	}		
}

