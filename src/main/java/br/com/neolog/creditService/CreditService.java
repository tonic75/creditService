package br.com.neolog.creditService;



public interface CreditService {
	public boolean isCreditOk( String cardNumber );
	public boolean isDebtOk( String agency, String account );
}
