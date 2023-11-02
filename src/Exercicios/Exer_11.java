package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_11 {
    public static void main(String[] args) {
        int cod ;
        int quant;
        double total = 0;

        System.out.println("Digite o código do produto:");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        cod = sc.nextInt();

        System.out.println("Digite a quantidade do produto:");
        Locale.setDefault(Locale.US);
        quant = sc.nextInt();

        if (cod == 1) {
            total = quant * 4.0;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (cod == 2) {
            total = quant * 4.5;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (cod == 3) {
            total = quant * 5.0;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (cod == 4) {
            total = quant * 2.0;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (cod == 5) {
            total = quant * 1.5;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else{
            System.out.println("Voce digitou um número incorreto tente novamente!");
        }


    }
}
