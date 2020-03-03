package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductsVetores2;

public class Vetores2 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		ProductsVetores2[] vect = new ProductsVetores2[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("\nDigite o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("\tDigite o preço: ");
			double price = sc.nextDouble();
			vect[i] = new ProductsVetores2(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double media = sum / vect.length;
		
		System.out.printf("\nA média de preços dos produtos é R$ %.2f%n", media);
		
		sc.close();
	}

}
