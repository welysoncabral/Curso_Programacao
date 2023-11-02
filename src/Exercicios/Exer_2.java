package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_2 {

	public static void main(String[] args) {
		double pi = 3.14159;
		double raio;
		double area;
		double result;
		
		System.out.println("Digite o raio do circulo:");
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		sc.nextLine();
		
		result = Math.pow(raio, 2.0);
		
		area = result * pi;
		
		System.out.printf("A área do circulo é de: " + "%.4f%n",area);
		
		sc.close();
	}

}
