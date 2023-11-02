package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_9 {
    public static void main(String[] args) {
        int A;
        int B;

        System.out.println("Digite o primeiro número inteiro");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();

        System.out.println("Digite o primeiro número inteiro");
        Locale.setDefault(Locale.US);
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
