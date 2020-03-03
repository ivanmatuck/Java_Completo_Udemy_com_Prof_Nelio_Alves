package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductsVetores_Ex;

public class Vetores_Ex {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ProductsVetores_Ex[] vect = new ProductsVetores_Ex[10];
				
		System.out.print("Quantos estudantes irão alugar quartos? ");
		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			System.out.print("\nAluguel: " + i +":");
			System.out.print("\nNome do estudante: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("email do estudante: ");
			String email = sc.nextLine();
			System.out.print("Qual o quarto escolhido? ");
			int quarto = sc.nextInt();
			vect[quarto] = new ProductsVetores_Ex(nome, email);
		}
		
		System.out.println("\nQuartos alugados:");
		for(int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + " : " + vect[i]);
			}
		}
		
		sc.close();
	}

}
