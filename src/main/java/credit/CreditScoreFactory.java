package credit;

public class CreditScoreFactory {
	//use the getCreditService method to get a object of type CreditService
	   public CreditService getCreditService(String creditType){
	      if(creditType == null){
	         return null;
	      }		
	      if(creditType.equalsIgnoreCase("EQUIFAX")){
	         return new Equifax();
	         
	      } else if(creditType.equalsIgnoreCase("TRANSUNION")){
	         return new TransUnion();
	         
	      } else if(creditType.equalsIgnoreCase("EXPERIAN")){
	         return new Experian();
	      }
	      
	      return null;
	   }
}