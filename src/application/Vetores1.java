package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetores1 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de n�meros: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um n�mero: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("A m�dia dos n�meros � %.2f", avg);
		
		sc.close();
	}

}
