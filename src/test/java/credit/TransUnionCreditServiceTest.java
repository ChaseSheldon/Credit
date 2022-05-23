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
public class TransUnionCreditServiceTest {
	
	@Mock
	private TransUnionCreditServiceClient transUnionCreditServiceClient;
	
	@InjectMocks
	private TransUnionCreditService transUnionCreditService;
	
	 @Before
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	
    
	@Test
	public void transUnionCreditServiceTestMethodShouldReturnAnIntegerLessThan999(){
		assertTrue(transUnionCreditService.score("string")<=999);
	}

}
