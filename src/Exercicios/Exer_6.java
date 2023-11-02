package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_6 {

    public static void main(String[] args) {
        double primeiro_valor_a;
        double segundo_valor_b;
        double terceiro_valor_c;

        double triangulo;
        double circulo;
        double trapezio;
        double quadrado;
        double retangulo;

        System.out.println("Digite o valor A: ");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        primeiro_valor_a = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o valor B: ");
        Locale.setDefault(Locale.US);
        //Locale.setDefault(new Locale("pt", "BR"));
        segundo_valor_b = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o valor C: ");
        Locale.setDefault(Locale.US);
        //Locale.setDefault(new Locale("pt", "BR"));
        terceiro_valor_c = sc.nextDouble();
        sc.nextLine();

        triangulo = (primeiro_valor_a * terceiro_valor_c) / 2;
        circulo = (terceiro_valor_c * terceiro_valor_c) * Math.PI;
        trapezio = (primeiro_valor_a + segundo_valor_b) * terceiro_valor_c / 2;
        quadrado = segundo_valor_b * segundo_valor_b;
        retangulo = primeiro_valor_a * segundo_valor_b;

        System.out.printf("TRIANGULO:" + "%.3f%n",triangulo);
        System.out.printf("CIRCULO:" + "%.3f%n",circulo);
        System.out.printf("TRAPEZIO:" + "%.3f%n",trapezio);
        System.out.printf("QUADRADO:" + "%.3f%n",quadrado);
        System.out.printf("RETANGULO:" + "%.3f%n",retangulo);

        sc.close();

    }
}
