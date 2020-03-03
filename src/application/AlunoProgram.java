package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class AlunoProgram {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Nota primeiro trimestre: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota segundo trimestre: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota terceiro trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("Nota Final: " + aluno.notaFinal());
		
		if (aluno.notaFinal() > 60.0) {
			System.out.println("Status: APROVADO");
		}
		else {
			System.out.printf("Status: REPROVADO \nFaltam %.2f pontos", aluno.pontosRestantes());
		}
		
		sc.close();
	}
}
