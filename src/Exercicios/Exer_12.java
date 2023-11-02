package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer_12 {
    public static void main(String[] args) {

        double valor;

        System.out.println("Digite um valor:");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        valor = sc.nextDouble();

        if (valor >= 0 & valor <=25){
            System.out.println("O intervalo deste valor está entre [0,25]:");
        }
        else if(valor > 25 & valor <=50){
            System.out.println("O intervalo deste valor está entre [25,50]:");
        }
        else if(valor > 50 & valor <=75){
            System.out.println("O intervalo deste valor está entre [50,75]:");
        }
        else if(valor > 75 & valor <=100){
            System.out.println("O intervalo deste valor está entre [75,100]:");
        }
        else{
            System.out.println("O intervalo não está entre 0 a 100:");
        }
        sc.close();
    }
}
