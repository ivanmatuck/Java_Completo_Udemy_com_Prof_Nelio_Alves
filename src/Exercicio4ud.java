import java.util.Locale;
import java.util.Scanner;

public class Exercicio4ud {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferen�a do produto de A e B pelo produto de C e D
		 * segundo a f�rmula: DIFERENCA = (A * B - C * D).
		 */
		
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int dif = (A * B) - (C * D);
		
		System.out.println("EX1 DIFEREN�A = " + dif);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int dif2 = (A * B) - (C * D);
		
		System.out.println("EX2 DIFEREN�A = " + dif2);

	    sc.close();
	}
}