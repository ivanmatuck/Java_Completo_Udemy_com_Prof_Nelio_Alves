import java.util.Locale;
import java.util.Scanner;

public class Exercicio5ud {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
				
		int numero, horas;
		double valorHora, salario;
				
		System.out.println("Número do funcionário: ");
		numero = sc.nextInt();
		
		System.out.println("Horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.println("Valor por hora: ");
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("\nNUMBER: " + numero);
		
		System.out.printf("SALARY: %.2f%n", salario);
		
		sc.close();
	    
	}
}