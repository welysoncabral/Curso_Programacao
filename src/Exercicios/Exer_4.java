package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_4 {

	public static void main(String[] args) {
		int num;
		double valorh;
		double horatrab;
		double result;
		
		System.out.println("Digite o numero do funcionário: ");	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite quantas horas ele trabalha: ");
		Locale.setDefault(Locale.US);
		horatrab = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Digite o valor por hora: ");
		Locale.setDefault(Locale.US);
		valorh = sc.nextDouble();
		sc.nextLine();
		
		result = valorh * horatrab;
		
		System.out.println("Funcionário número:" + num);
		System.out.printf("Salário Base: U$" + "%.2f%n",result);
		
		sc.close();
	}

}