package credit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExperianCreditService implements CreditService {
	@Autowired
	private ExperianCreditServiceClient experianCreditServiceClient;

	public ExperianCreditServiceClient getExperianCreditServiceClient() {
		return experianCreditServiceClient;
	}

	public void setExperianCreditServiceClient(ExperianCreditServiceClient experianCreditServiceClient) {
		this.experianCreditServiceClient = experianCreditServiceClient;
	}

	@Override
	public int score(String social) {
		return experianCreditServiceClient.socialToScore(social);
	}

}