package credit;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EquifaxCreditServiceTest {
	
	@Mock
	private EquifaxCreditServiceClient equifaxCreditServiceClient;
	
	@InjectMocks
	private EquifaxCreditService equifaxCreditService;
	
	 @Before
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	
    
	@Test
	public void equifaxCreditServiceTestMethodShouldReturnAnIntegerLessThan999(){
		assertTrue(equifaxCreditService.score("string")<=999);
	}

}
