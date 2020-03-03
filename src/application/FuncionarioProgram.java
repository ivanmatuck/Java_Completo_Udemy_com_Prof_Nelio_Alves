package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class FuncionarioProgram {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + ", $ " + func);
		
		System.out.println("Which percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		
		func.novoSalario(porcentagem);
		
		System.out.println("Updated data: "+ func);
		
		sc.close();
	}

}
