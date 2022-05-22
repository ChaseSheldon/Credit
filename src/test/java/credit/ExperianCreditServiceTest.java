package credit;



import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExperianCreditServiceTest {
	
	
	ExperianCreditService experianCreditService = new ExperianCreditService();
    

    
    
	@Test
	public void experianCreditServiceTestShouldReturnAnIntegerLessThan999(){
		assertTrue(experianCreditService.score("string")<=999);
	}

}