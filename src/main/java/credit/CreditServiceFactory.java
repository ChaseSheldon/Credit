package credit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditServiceFactory {
	//use the getCreditService method to get a object of type CreditService
	@Autowired
	private EquifaxCreditService equifaxCreditService;
	@Autowired
	private ExperianCreditService experianCreditService;
	@Autowired
	private TransUnionCreditService transUnionCreditService;
	   public CreditService getCreditService(String creditType){
	      if(creditType == null){
	         return null;
	      }		
	      if(creditType.equalsIgnoreCase("EQUIFAX")){
	         return equifaxCreditService;
	         
	      } else if(creditType.equalsIgnoreCase("TRANSUNION")){
	         return transUnionCreditService;
	         
	      } else if(creditType.equalsIgnoreCase("EXPERIAN")){
	         return experianCreditService;
	      }
	      
	      return null;
	   }
}