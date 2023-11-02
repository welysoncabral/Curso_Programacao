package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_7 {

    public static void main(String[] args) {
        int valor ;

        System.out.println("Digite um número inteiro:");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        valor = sc.nextInt();

        if (valor <0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NÂO NEGATIVO");
        }
    }
}
