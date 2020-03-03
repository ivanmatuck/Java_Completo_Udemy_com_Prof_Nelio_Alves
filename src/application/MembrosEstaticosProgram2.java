package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class MembrosEstaticosProgram2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circunferencia(raio);
		
		double v = Calculator.volume(raio);
		
		System.out.printf("\nRaio: %.2f\nCircunferência: %.2f\nVolume: %.2f%nValor de Pi: %.2f", raio, c, v, Calculator.PI);
		
		sc.close();
	}
} 
