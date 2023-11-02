import java.util.Locale;
import java.util.Scanner;

public class Exemplo_cumulativa {
    public static void main(String[] args) {

        int minutos;
        double conta = 50.0;

        System.out.println("Digite a quantidade de minutos utilizados:");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        minutos = sc.nextInt();

        if (minutos > 100){
 //           conta = conta + (minutos - 100) * 2.0;
            conta += (minutos - 100) * 2.0; // expressão cumulativa
        }
        System.out.printf("Total a ser pago: R$ %.2f%n", conta);

        sc.close();
    }
}
