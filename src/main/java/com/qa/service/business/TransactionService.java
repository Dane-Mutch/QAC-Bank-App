package com.qa.service.business;

public interface TransactionService {
	
	String getAllTransactionStatement(long ACC_ID);
	
	String getBalance(long ACC_ID);

}
