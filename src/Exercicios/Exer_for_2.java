package Exercicios;

import java.util.Scanner;

public class Exer_for_2 {
    public static void main(String[] args) {

        int in = 0;
        int out = 0;
        int N;

        System.out.println("Digite um número inteiro:");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            }
            else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}