package credit;




public class EquifaxCreditService implements CreditService {
	
	 EquifaxCreditServiceClient equifaxCreditServiceClient = new EquifaxCreditServiceClient();

	
	@Override
	public int score(String social) {
		return equifaxCreditServiceClient.SocToScore(social);
	}

}
