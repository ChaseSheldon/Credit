package credit;

import org.springframework.stereotype.Component;

@Component
public class TransUnionCreditService implements CreditService {
	
	TransUnionCreditServiceClient transUnionCreditServiceClient = new TransUnionCreditServiceClient();

	@Override
	public int score(String social) {
		return transUnionCreditServiceClient.SocToScore(social);
	}

}
