package util;

public class CurrencyConverter {

	public static double priceDollar;
	public static double iof;
	public static double qtde;
		
	public static double conversao() {
		return qtde * priceDollar * (iof /100 + 1);
	}

}
