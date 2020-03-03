import java.util.Locale;
import java.util.Scanner;

public class Exercicio17ud {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de teste a fazer:");
		int n = sc.nextInt();

		for (int i=0; i<n; i++) {
			System.out.println("\nTeste número " + (i+1));
			System.out.println("Digite o primeiro valor:");
			double v1 = sc.nextDouble();
			System.out.println("Digite o segundo valor:");
			double v2 = sc.nextDouble();
			System.out.println("Digite o terceiro valor:");
			double v3 = sc.nextDouble();

			double mediaPond = (v1 * 2.0 + v2 * 3.0 + v3 * 5.0) / 10.0;

			System.out.printf("A média é %.1f%n", mediaPond);
		}

		sc.close();
	}
}
