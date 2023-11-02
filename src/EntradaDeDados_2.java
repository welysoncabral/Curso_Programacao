import java.util.Scanner;

public class EntradaDeDados_2 {
	
	public static void main(String[] args) {
	
	System.out.println("Escreva sua idade:");
	Scanner sc = new Scanner (System.in);
	
	int x;
	x = sc.nextInt();
	
	System.out.println("Você digitou: " +x);
	
	sc.close();
}

}
