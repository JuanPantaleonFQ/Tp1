package Ejercicio1;

public class Circulo {
	// atributos donde x e y representan el centro del circulo.
	private int x;
	private int y;
	private int radio;
	
	
	//constructor:
	public Circulo(int x, int y, int radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		
	}
	
	
	//metodos:
	public double area(int radio) {		
		return (Math.PI*Math.pow(radio,2));
		
	}
	
	public void pruebaescritura(int x, int y) {
		System.out.println("escribe: " + x + " " + y );
	}
	
	public void traslada(int d) {
		x += d;
				
	}
	
	
	// To string...
	public String toString() {
			return " círculo con centro (" + x + ", " + y + ") y radio " + radio;
		}
			
	}


}
