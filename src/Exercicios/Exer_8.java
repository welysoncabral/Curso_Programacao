package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_8 {
    public static void main(String[] args) {
        int num;

        System.out.println("Digite um número inteiro:");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        num = num % 2;

        if (num == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
    }
}
