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
public class ExperianCreditServiceTest {
	
	@Mock
	private ExperianCreditServiceClient experianCreditServiceClient;
	
	@InjectMocks
	private ExperianCreditService experianCreditService;
	
	 @Before
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	
    
	@Test
	public void experianCreditServiceTestMethodShouldReturnAnIntegerLessThan999(){
		assertTrue(experianCreditService.score("string")<=999);
	}

}