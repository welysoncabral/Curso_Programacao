package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_1 {

	public static void main(String[] args) {
		
		float comp;
		float alt;
		float area;
		float valor;
		double result;
		
		

		System.out.println("Digite o comprimento do terreno:");
		Scanner sc = new Scanner(System.in);
		comp = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Digite a altura do terreno:");
		alt = sc.nextFloat();
		sc.nextLine();
		
			area = alt * comp;
		
		System.out.println("Digite o valor do metro quadrado do terreno:");
		valor = sc.nextFloat();
		sc.nextLine();
		
			result = area * valor;
			
			Locale.setDefault(Locale.US);			
			System.out.printf("O valor do terreno e de:" + "%.2f%n",result);
			System.out.printf("O valor da área e de:" + "%.2f%n",area);
	
			sc.close();
	}

}
