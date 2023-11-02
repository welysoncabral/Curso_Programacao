package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_5 {

	public static void main(String[] args) {
		int num_peca_1;
		double val_peca_1;
		double result_peca_1;
		double result_peca_total;
		
		int num_peca_2;
		double val_peca_2;
		double result_peca_2;
		
		System.out.println("Digite o código da peça: ");	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		System.out.println("Digite a qauntidade de peças: ");	
		Locale.setDefault(Locale.US);
		num_peca_1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o valor da peça: ");
		Locale.setDefault(Locale.US);
		val_peca_1 = sc.nextDouble();
		sc.nextLine();
		
		result_peca_1 = val_peca_1 * num_peca_1;
		
		System.out.println("Digite o código da peça: ");	
		Locale.setDefault(Locale.US);
		sc.nextLine();
		
		System.out.println("Digite a qauntidade de peças: ");	
		Locale.setDefault(Locale.US);
		num_peca_2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o valor da peça: ");
		Locale.setDefault(Locale.US);
		val_peca_2 = sc.nextDouble();
		sc.nextLine();
		
		result_peca_2 = val_peca_2 * num_peca_2;
		
		result_peca_total = result_peca_1 + result_peca_2;
		
		System.out.printf("Total a pagar: U$" + "%.2f%n",result_peca_total);
		
		sc.close();
	}

}