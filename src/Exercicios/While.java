package Exercicios;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        int num;
        int soma = 0;

        System.out.println("Digite um número:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num != 0){
            soma += num;
            num = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}
