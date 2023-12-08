package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exer_for_3 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        int n;

        System.out.println("Digite o número de casos de teste:");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=0; i<n; i++) {

           a = sc.nextDouble();
           b = sc.nextDouble();
           c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("O resultado é %.1f%n", media);
        }

        sc.close();
    }
}
