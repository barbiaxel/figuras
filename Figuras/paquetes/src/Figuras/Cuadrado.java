package Figuras;

import java.awt.Graphics;

public class Cuadrado implements Ifiguras{
	private int lado;
	
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double area() {
		return Math.pow(lado, 2);
	}
	@Override
	public double perimetro() {
		return lado*4;
	}
	public void paint(Graphics g){
		g.drawRect(80, 80, 200, 200); // Dibuja un cuadrado
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando el cuadrado.....");
		System.out.println("******");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("******");
		
	}
}
