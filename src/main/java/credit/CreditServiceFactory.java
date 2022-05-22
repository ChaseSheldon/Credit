package credit;

public class CreditServiceFactory {
	//use the getCreditService method to get a object of type CreditService
	   public CreditService getCreditService(String creditType){
	      if(creditType == null){
	         return null;
	      }		
	      if(creditType.equalsIgnoreCase("EQUIFAX")){
	         return new EquifaxCreditService();
	         
	      } else if(creditType.equalsIgnoreCase("TRANSUNION")){
	         return new TransUnionCreditService();
	         
	      } else if(creditType.equalsIgnoreCase("EXPERIAN")){
	         return new ExperianCreditService();
	      }
	      
	      return null;
	   }
}