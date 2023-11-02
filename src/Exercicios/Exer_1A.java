package Exercicios;

import java.util.Scanner;

public class Exer_1A {

	public static void main(String[] args) {
		double var1;
		double var2;
		double result;
		
		System.out.println("Digite o primeiro numero:");
		Scanner sc = new Scanner(System.in);
		var1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Digite o segundo numero:");
		var2 = sc.nextDouble();
		sc.nextLine();
		
		result = var1 + var2;
		
		System.out.printf("A soma dos valores é: " + "%.2f%n",result);
		
		sc.close();
	}

}
