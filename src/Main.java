import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.print("Olá mundo");
		System.out.println("Bom dia!");
		double x = 10.7456678;
		int y = 32;
		System.out.println(y);

		System.out.println(x);

		System.out.printf("%.2f%n", x);
		System.out.printf("%.5f%n", x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.5f%n", x);

		System.out.println("Resultado=" + x + "metros");

		System.out.printf("Resultado= %.2f metros%n", x);
	}

}
