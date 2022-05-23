package credit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EquifaxCreditService implements CreditService {
	@Autowired
	private EquifaxCreditServiceClient equifaxCreditServiceClient;

	
	public EquifaxCreditServiceClient getEquifaxCreditServiceClient() {
		return equifaxCreditServiceClient;
	}


	public void setEquifaxCreditServiceClient(EquifaxCreditServiceClient equifaxCreditServiceClient) {
		this.equifaxCreditServiceClient = equifaxCreditServiceClient;
	}


	@Override
	public int score(String social) {
		return equifaxCreditServiceClient.socialToScore(social);
	}

}
