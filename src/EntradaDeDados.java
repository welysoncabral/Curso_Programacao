import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		System.out.println("Escreva seu nome:");
		
		Scanner sc = new Scanner (System.in);
		
		String x;
		x = sc.next();
		
		System.out.println("Você digitou: " +x);
		
		sc.close();
	}

}

