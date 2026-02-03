package com.foreachmethod.loggingtransactions;

import java.util.*;

public class TransactionMain {

	public static void main(String[] args) {

		List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003", "TXN1004");

		TransactionLoggerService loggerService = new TransactionLoggerService();

		loggerService.logTransactions(transactionIds);
	}
}
