package com.foreachmethod.loggingtransactions;

import java.time.LocalDateTime;
import java.util.*;

public class TransactionLoggerService {

	public void logTransactions(List<String> transactionIds) {

		transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
	}
}
