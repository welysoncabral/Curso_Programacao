import java.util.Locale;
import java.util.Scanner;

public class Exemplo_condicao {
    public static void main(String[] args) {
        double hora;

        System.out.println("Digite o hora:");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        hora = sc.nextDouble();
        sc.nextLine();

        if (hora >= 0 & hora <= 6){
            System.out.println("Boa madrugada");
        }
        else if (hora >6 & hora <= 12) {
                System.out.println("Bom dia");
        }
        else if (hora >12 & hora <= 18){
                    System.out.println("Boa tarde");
        }
            else{
                    System.out.println("Boa noite");
                }
            }
        }