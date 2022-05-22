package credit;

import org.springframework.stereotype.Component;

@Component
public class ExperianCreditService implements CreditService {
	
	ExperianCreditServiceClient experianCreditServiceClient = new ExperianCreditServiceClient();

	@Override
	public int score(String social) {
		return experianCreditServiceClient.SocToScore(social);
	}

}