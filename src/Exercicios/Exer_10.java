package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_10 {
    public static void main(String[] args) {
        int hora_ini;
        int hora_fim;
        int duracao;

        System.out.println("Digite a hora inicial:");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        hora_ini = sc.nextInt();

        System.out.println("Digite a hora final:");
        Locale.setDefault(Locale.US);
        hora_fim = sc.nextInt();

        if (hora_ini < hora_fim) {
            duracao = hora_fim - hora_ini;
        }
        else {
            duracao = 24 - hora_ini + hora_fim;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
