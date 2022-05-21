package credit;

public class CreditFactoryDemo {
	

	   public static void main(String[] args) {
	      CreditScoreFactory creditScoreFactory = new CreditScoreFactory();

	      //get an object of Equifax
	      CreditService creditScore1 = creditScoreFactory.getCreditService("Equifax");

	      //call the score method of Equifax
	      creditScore1.score();

	      //get an object of Experian
	      CreditService creditScore2 = creditScoreFactory.getCreditService("Experian");

	      //call the score method of Experian
	      creditScore2.score();

	      //get an object of TransUnion
	      CreditService creditScore3 = creditScoreFactory.getCreditService("TransUnion");

	      //call the score method of TransUnion
	      creditScore3.score();
	   }
	
}