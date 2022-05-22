package credit;



import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TransUnionCreditServiceTest {
	
	
	TransUnionCreditService transUnionCreditService = new TransUnionCreditService();
    

    
    
	@Test
	public void transUnionCreditServiceTestMethodShouldReturnAnIntegerLessThan999(){
		assertTrue(transUnionCreditService.score("string")<=999);
	}

}
