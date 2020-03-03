import java.util.Locale;

public class Exercicio1ud {
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";

		byte age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf(
				"Products: \n" + "%s, which price is $ %.2f \n" + "%s, which price is $ %.2f \n" + "\n"
						+ "Record: %d years old, code %d and gender: %c \n" + "\n"
						+ "Measue with eight decimal places: %f \n" + "Rouded (three decimal places): %.3f \n",
				product1, price1, product2, price2, age, code, gender, measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}
}
