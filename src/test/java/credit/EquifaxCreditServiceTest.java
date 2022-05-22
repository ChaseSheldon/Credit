package credit;



import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EquifaxCreditServiceTest {
	
	
	EquifaxCreditService equifaxCreditService = new EquifaxCreditService();
    

    
    
	@Test
	public void equifaxCreditServiceTestMethodShouldReturnAnIntegerLessThan999(){
		assertTrue(equifaxCreditService.score("string")<=999);
	}

}
