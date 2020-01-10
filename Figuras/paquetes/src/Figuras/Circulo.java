package Figuras;

public class Circulo implements Ifiguras{
		private double radio;
		
		public Circulo(double radio) {
			super();
			this.radio = radio;
		}

		@Override
		public double area() {
			return Math.pow(radio, 2)* Math.PI;
		}
		@Override
		public double perimetro() {
			return Math.PI* 2*radio;
		}

		@Override
		public void dibujar() {
			System.out.println("Dibujando el circulo.....");
			System.out.println("  **");
			System.out.println(" *  *");
			System.out.println("*    *");
			System.out.println("*    *");
			System.out.println(" *  *");
			System.out.println("  **");
		}
}
