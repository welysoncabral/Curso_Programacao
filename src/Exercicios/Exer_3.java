package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_3 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		int D;
		int dif;
		
		System.out.println("Digite o primeiro número:");
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o segundo número:");
		Locale.setDefault(Locale.US);	
		B = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o terceiro número:");
		Locale.setDefault(Locale.US);	
		C = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o quarto número:");
		Locale.setDefault(Locale.US);	
		D = sc.nextInt();
		sc.nextLine();
		
		dif = A * B - C * D;
		
		System.out.println("A diferença é de: " + dif);
		
		sc.close();
	}

}