
import java.util.Scanner;
public class Exemplo_do_while {
    public static void main(String[] args) {

        char resp;

        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Digite a temperatura em Celsius:");
            double C = sc.nextDouble();
            double F;
            F = 9 * C / 5 + 32;
            System.out.printf("Equivalente a Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir s/n?");
            resp = sc.next().charAt(0);

        }while (resp != 'n');

        sc.close();
    }
}
