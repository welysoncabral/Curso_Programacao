import java.util.Scanner;

public class EntradaDeDados_4 {

	public static void main(String[] args) {
		
		System.out.println("Escreva seu nome:");
		
		Scanner sc = new Scanner (System.in);
		
		char x;
		x = sc.next().charAt(0);
		
		System.out.println("Primeiro caracter que você digitou foi: " +x);
		
		sc.close();
	}

}