import java.util.Locale;
import java.util.Scanner;

public class Exercicio4ud {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int dif = (A * B) - (C * D);
		
		System.out.println("EX1 DIFERENÇA = " + dif);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int dif2 = (A * B) - (C * D);
		
		System.out.println("EX2 DIFERENÇA = " + dif2);

	    sc.close();
	}
}