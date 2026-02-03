package com.streamapi.insuranceclaim;

import java.util.*;
import java.util.stream.*;

public class ClaimService {

	public Map<String, Double> getAverageClaimAmountByType(List<InsuranceClaim> claims) {

		return claims.stream().collect(Collectors.groupingBy(InsuranceClaim::getClaimType,
				Collectors.averagingDouble(InsuranceClaim::getClaimAmount)));
	}
}
