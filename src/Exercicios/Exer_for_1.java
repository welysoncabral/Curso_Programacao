package Exercicios;

import java.util.Scanner;

public class Exer_for_1 {
    public static void main(String[] args) {
        int x;

        System.out.println("Digite um número inteiro:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for (int i=1; i<=x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
