import java.util.Scanner;

public class Exercicio2ud {
	public static void main(String[] args) {

		Scanner entDados = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		System.out.println("Digite sua idade: ");
		x = entDados.nextInt();
		entDados.nextLine();
		System.out.println("Digite seu nome: ");
		s1 = entDados.nextLine();
		System.out.println("Digite seu endere�o: ");
		s2 = entDados.nextLine();
		System.out.println("Digite seu bairro: ");
		s3 = entDados.nextLine();

		System.out.println("\nDados Digitados - modo 1");
		System.out.printf("Idade: %d \n", x);
		System.out.printf("Nome: %s \n", s1);
		System.out.printf("Endere�o: %s \n", s2);
		System.out.printf("Bairro: %s \n", s3);

		System.out.println("\nDADOS DIGITADOS - modo 2");
		System.out.println("Idade: " + x);
		System.out.println("Nome: " + s1);
		System.out.println("Endere�o: " + s2);
		System.out.println("Bairro: " + s3);
		
		System.out.println();

	    
	    entDados.close();
	}
}
