import java.util.Scanner;

public class EntradaDeDados_5 {

	public static void main(String[] args) {
		
		System.out.println("Escreva seu nome, sua idade e sua altura:");
		
		Scanner sc = new Scanner (System.in);
		
		String x;
		int y;
		double z;
		
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println("Nome: "+x);
		System.out.println("Idade: "+y);
		System.out.println("Altura: "+z);
		
		sc.close();
	}

}