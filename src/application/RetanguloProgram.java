package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class RetanguloProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Entre a largura e depois a altura do ret�ngulo:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("Per�metro: %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());
		
		sc.close();
	}
}
