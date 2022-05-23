package credit;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;


@ExtendWith(MockitoExtension.class)
public class CreditServiceFactoryTest {
	@Mock
	private EquifaxCreditService equifaxCreditService;
	@Mock
	private ExperianCreditService experianCreditService;
	@Mock
	private TransUnionCreditService transUnionCreditService;
	@InjectMocks
	private CreditServiceFactory creditServiceFactory;
	 @Before
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	
	@Test
	public void shouldReturnACreditServiceClassWhenGetServiceIsCorrectlyCalledForEquifax(){
		 
		
		//see if getCreditService method correctly return  a CreditService class
		assertNotNull(creditServiceFactory.getCreditService("equifax"));
	}
	@Test
	public void shouldReturnACreditServiceClassWhenGetServiceIsCorrectlyCalledForExperian(){
		
		//see if getCreditService method correctly return  a CreditService class
		assertNotNull(creditServiceFactory.getCreditService("experian"));
	}
	@Test
	public void shouldReturnACreditServiceClassWhenGetServiceIsCorrectlyCalledForTransUnion(){
		
		//see if getCreditService method correctly return a CreditService class
		assertNotNull(creditServiceFactory.getCreditService("transUnion"));
	}
	@Test
	public void wrongSpellingNotMAtchingToThreeCreditTypesShouldReturnNull() {
		
		//getCreditService should return null if the spelling does not match the three credit services
		assertNull(creditServiceFactory.getCreditService("equifx"));
		
	}
	@Test
	public void AllCapsShouldStillReturnACreditService() {
		
		//getCreditService should return a creditService object with all caps
		assertNotNull(creditServiceFactory.getCreditService("EXPERIAN"));
	}
}
