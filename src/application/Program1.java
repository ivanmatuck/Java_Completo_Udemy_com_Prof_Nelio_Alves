package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		sc.close();
	}

}
