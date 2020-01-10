package Figuras;

import java.util.Scanner;

public class Test {
	
public static void main(String a[]){
		Scanner teclado =new Scanner(System.in);
		int opcion;
		int lado;
		new Test();

		do{ 
			System.out.println("Figuras geometricas y cálculos:");
			System.out.println("1.- cuadrado");
			System.out.println("2.- triangulo");
			System.out.println("3.- circulo");
			System.out.println("4.- Salir");
			System.out.println("Introduce opción");
			opcion=teclado.nextInt();
			switch(opcion){
			case 1: System.out.println("Introduce el lado del cuadrado en cm: ");
					lado=teclado.nextInt();
					Cuadrado c=new Cuadrado(lado);
					System.out.println("El área del cuadrado es: "+ c.area() +" cm2");
					System.out.println("El perímetro del cuadrado es: "+c.perimetro()+" cm");
					c.dibujar();
					System.out.println("Pulsa una letra para continuar");
					String i=teclado.next();
					break;

			case 2: System.out.println("Introduce el lado 1 del triangulo: ");
					int lado1=teclado.nextInt();
					System.out.println("Introduce el lado 2 del triangulo: ");
					int lado2=teclado.nextInt();
					System.out.println("Introduce el lado 3 del triangulo: ");
					int lado3=teclado.nextInt();
					System.out.println("Introduce la base del triangulo: ");
					int base=teclado.nextInt();
					System.out.println("Introduce la altura del triangulo: ");
					int altura=teclado.nextInt();
					Triangulo t=new Triangulo(lado1,lado2,lado3,base, altura);
					if(lado1>=lado2+lado3 || lado2>=lado1+lado3 || lado3>=lado1+lado2 )
						System.out.println("Los lados no forman triángulo");
					else{
						System.out.println("El área del triángulo es: "+ t.area() +" cm2");
						System.out.println("El perímetro del triángulo es: "+t.perimetro()+" cm");
						t.dibujar();
						System.out.println("Pulsa una letra para continuar");
						i=teclado.next();
					}
			break;

			case 3: System.out.println("Introduce el radio del circulo: ");
					double radio=teclado.nextDouble();
					Circulo cir=new Circulo(radio);
					System.out.println("El área del círculo es: "+ cir.area()+" cm2" );
					System.out.println("El perímetro del círculo es: "+cir.perimetro()+" cm");
					cir.dibujar();
					System.out.println("Pulsa una letra para continuar");
					i=teclado.next();
					break;
			case 4: System.out.println("FIN DE PROGRAMA");
					break;
			
			default:System.out.println("Figura no prevista, repetir..");		
			}
		}while(opcion!=4);
		teclado.close();
		
	}
}
