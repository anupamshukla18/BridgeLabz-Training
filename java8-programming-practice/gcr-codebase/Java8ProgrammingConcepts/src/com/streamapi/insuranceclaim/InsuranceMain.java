package com.streamapi.insuranceclaim;

import java.util.*;

public class InsuranceMain {

	public static void main(String[] args) {

		List<InsuranceClaim> claims = Arrays.asList(new InsuranceClaim(101, "Health", 50000),
				new InsuranceClaim(102, "Vehicle", 20000), new InsuranceClaim(103, "Health", 70000),
				new InsuranceClaim(104, "Life", 150000), new InsuranceClaim(105, "Vehicle", 30000),
				new InsuranceClaim(106, "Health", 60000));

		ClaimService service = new ClaimService();

		Map<String, Double> avgClaimAmount = service.getAverageClaimAmountByType(claims);

		avgClaimAmount.forEach((type, avg) -> System.out.println(type + " → Average Claim Amount: " + avg));
	}
}
