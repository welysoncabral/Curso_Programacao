import java.util.Locale;

public class Exer_1 {

	public static void main(String[] args) {
		
		String produc1 = "Computer,";
		String produc2 = "Office desk,";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Products:%n" + produc1 + " wich price is $ " + "%.2f%n", price1);
		System.out.printf(produc2 + " wich price is $ " + "%.2f%n", price2);
		System.out.printf("%nRecord:" + age + " years old," + " code " + code + " gender: " + gender);
		System.out.printf("%n%nMeasue with eigth decimal places: " + "%.8f%n", measure);
		System.out.printf("Rouded (Three decimal places): " + "%.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: " + "%.3f%n", measure);
	}

}
