import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        String dia_seman;
        int x = 0;

        System.out.println("Digite um número para saber o dia da semana");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        switch (x){
            case 1:
                dia_seman = "Domingo";
                break;
            case 2:
                dia_seman = "Segunda";
                break;
            case 3:
                dia_seman = "Terça";
                break;
            case 4:
                dia_seman = "Quarta";
                break;
            case 5:
                dia_seman = "Quinta";
                break;
            case 6:
                dia_seman = "Sexta";
                break;
            case 7:
                dia_seman = "Sábado";
                break;
            default:
                dia_seman = "Valor inválido";
        }

        System.out.println("Dia da Semana selecionado é: " + dia_seman);
        sc.close();
    }
}
