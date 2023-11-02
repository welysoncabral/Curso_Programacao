import java.util.Scanner;

public class EntradaDeDados_3 {

	public static void main(String[] args) {
		
		System.out.println("Escreva sua altura:");
		
		Scanner sc = new Scanner (System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.println("Você digitou: " +x);
		
		sc.close();
	}

}