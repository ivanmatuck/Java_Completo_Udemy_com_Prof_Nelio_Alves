import java.util.Locale;
import java.util.Scanner;

public class Exercicio5ud {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
		 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
		 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
		 * casas decimais.
		 */
				
		int numero, horas;
		double valorHora, salario;
				
		System.out.println("N�mero do funcion�rio: ");
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