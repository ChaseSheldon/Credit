package credit;

import org.springframework.stereotype.Component;

@Component
public class TransUnionCreditServiceClient {
	public int socialToScore(String social) {
		//this would use some sort of web service to connect to an api endpoint
		//for now it just returns an integer
		return 700;
	}
}

