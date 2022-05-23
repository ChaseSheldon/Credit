package credit;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditFactoryDemo {
	

	   public static void main(String[] args) {
		   ConfigurableApplicationContext context = SpringApplication.run(CreditFactoryDemo.class, args);
	       CreditServiceFactory creditServiceFactory = context.getBean(CreditServiceFactory.class);

	      //get an object of Equifax
	      CreditService creditScore1 = creditServiceFactory.getCreditService("Equifax");
	     

	      //call the score method of Equifax
	      System.out.println(creditScore1.score("DummySocialSecurityNumberString"));

	      //get an object of Experian
	      CreditService creditScore2 = creditServiceFactory.getCreditService("Experian");

	      //call the score method of Experian
	      creditScore2.score("DummySocialSecurityNumberString");

	      //get an object of TransUnion
	      CreditService creditScore3 = creditServiceFactory.getCreditService("TransUnion");

	      //call the score method of TransUnion
	      creditScore3.score("DummySocialSecurityNumberString");
	   }

	
		
	
	
}