package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_14_senha {
    public static void main(String[] args) {
        int senha;

        System.out.println("Digite a senha:");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Digite novamente! Senha estava incorreta!");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}


