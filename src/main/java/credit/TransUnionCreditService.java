package credit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransUnionCreditService implements CreditService {
	@Autowired
	private TransUnionCreditServiceClient transUnionCreditServiceClient;

	public TransUnionCreditServiceClient getTransUnionCreditServiceClient() {
		return transUnionCreditServiceClient;
	}

	public void setTransUnionCreditServiceClient(TransUnionCreditServiceClient transUnionCreditServiceClient) {
		this.transUnionCreditServiceClient = transUnionCreditServiceClient;
	}

	@Override
	public int score(String social) {
		return transUnionCreditServiceClient.socialToScore(social);
	}

}
