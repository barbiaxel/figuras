package Figuras;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;

public class Triangulo implements Ifiguras{
	private int lado1,lado2,lado3;
	private int base, altura;
	
	public Triangulo(int lado1, int lado2, int lado3,int base, int altura) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return (base*altura)/2;
	}
	@Override
	public double perimetro() {
		return lado1+lado2+lado3;
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando el triangulo.....");
		System.out.println("     *");
		System.out.println("    * *");
		System.out.println("   *   *");
		System.out.println("  *     *");
		System.out.println(" *       *");
		System.out.println("***********");
		
	}

}
