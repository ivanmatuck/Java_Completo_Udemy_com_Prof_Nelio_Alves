package application;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticosProgram1 {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = circunferencia(raio);
		
		double v = volume(raio);
		
		System.out.printf("\nRaio: %.2f\nCircunferência: %.2f\nVolume: %.2f%nValor de Pi: %.2f", raio, c, v, PI);
		
		sc.close();
	}
	
	public static double circunferencia(double raio) {
		return 2 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * Math.pow(raio, 3) / 3;
	}
} 
