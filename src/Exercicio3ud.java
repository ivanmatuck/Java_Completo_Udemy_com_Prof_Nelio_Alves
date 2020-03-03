import java.util.Locale;
import java.util.Scanner;

public class Exercicio3ud {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = pi . raio2 Considere o valor de pi = 3.14159
		 */
		
		
		double R, A, pi = 3.14159;
		R = sc.nextDouble();
		A = pi * (Math.pow(R,2));
		
	    System.out.println("Digite o primeiro valor de 'pi'");
		R = sc.nextDouble();
		A = pi * (Math.pow(R,2));
	    System.out.printf("A=%.4f%n", A);
	    

		System.out.println("Digite o segundo valor de 'pi'");
		R = sc.nextDouble();
		A = pi * (Math.pow(R,2));
	    System.out.printf("A=%.4f%n", A);
	    

		System.out.println("Digite o terceiro valor de 'pi'");
		R = sc.nextDouble();
		A = pi * (Math.pow(R,2));
	    System.out.printf("A=%.4f%n", A);

	    
	    
	    sc.close();
	    
	}
}