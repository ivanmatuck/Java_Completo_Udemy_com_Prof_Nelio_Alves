import java.util.Scanner;

public class Exercicio13ud {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int cod = sc.nextInt();
		
		while (cod != 4 ) {
			if (cod == 1) {
				alcool += 1;
			}
			else if (cod == 2) {
				gasolina += 1;				
			}
			else if (cod == 3) {
				diesel += 1;
			}
			else {
				System.out.println("Digite um código válido:");
			}
			
			cod = sc.nextInt();
		}
		
		System.out.printf("Muito Obrigado!\n Álcool: %d\n Gasolina: %d\n Diesel: %d", alcool, gasolina, diesel);
		
		sc.close();
	}
}
