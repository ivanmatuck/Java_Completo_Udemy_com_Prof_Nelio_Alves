import java.util.Locale;
import java.util.Scanner;

public class Exercicio18ud {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de divisões a fazer:");
		int n = sc.nextInt();

		for (int i=0; i<n; i++) {
			System.out.println("\nDivisão número " + (i+1));
			System.out.println("Digite o primeiro valor:");
			int n1 = sc.nextInt();
			System.out.println("Digite o segundo valor:");
			int n2 = sc.nextInt();
			if (n2 == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double divisao = (double)n1 / n2;
				System.out.printf("O resultado é %.1f%n", divisao);
			}
			
		}

		sc.close();
	}
}
