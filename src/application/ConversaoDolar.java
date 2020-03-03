package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ConversaoDolar {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.qtde = sc.nextDouble();
		
		System.out.print("What is the IOF? ");
		CurrencyConverter.iof = sc.nextDouble();
		
		System.out.printf("%nDollar price: R$ %.2f%nQtde: U$ %.2f dollars %nPaid in reais: R$ %.2f%n",
				CurrencyConverter.priceDollar, CurrencyConverter.qtde, CurrencyConverter.conversao());
	
		sc.close();
	
	}
	
	
}
