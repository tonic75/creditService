package br.com.neolog.creditService;

import org.springframework.stereotype.Component;

@Component("creditService")
public class CreditServiceImp implements CreditService {

	public synchronized boolean isCreditOk(String cardNumber) {
		try {
			wait(10*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public synchronized boolean isDebtOk(String agency, String account) {
		try {
			wait(10*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
}
