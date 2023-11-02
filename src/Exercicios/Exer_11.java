package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_11 {
    public static void main(String[] args) {
        int cod ;
        int quant;

        System.out.println("Digite o código do produto:");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        cod = sc.nextInt();

        System.out.println("Digite a quantidade do produto:");
        Locale.setDefault(Locale.US);
        quant = sc.nextInt();

    }
}
