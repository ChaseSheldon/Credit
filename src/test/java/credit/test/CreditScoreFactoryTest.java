package credit.test;
import credit.CreditScoreFactory;
import credit.CreditService;
import credit.Equifax;
import credit.Experian;
import credit.TransUnion;
import junit.framework.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;


public class CreditScoreFactoryTest {
	
	
	@Test
	public void shouldReturnAnEquifaxClassWhenGetServiceIsCorrectlyCalledForEquifax(){
		CreditScoreFactory shouldBeEquifax = new CreditScoreFactory();
		//see if getCreditService method correctly return an Equifax class
		assertEquals(shouldBeEquifax.getCreditService("equifax").getClass(),Equifax.class);
	}
	@Test
	public void shouldReturnAnExperianClassWhenGetServiceIsCorrectlyCalledForExperian(){
		CreditScoreFactory shouldBeExperian = new CreditScoreFactory();
		//see if getCreditService method correctly return an Experian class
		assertEquals(shouldBeExperian.getCreditService("experian").getClass(),Experian.class);
	}
	@Test
	public void shouldReturnATransUnionClassWhenGetServiceIsCorrectlyCalledForTransUnion(){
		CreditScoreFactory shouldBeTransUnion = new CreditScoreFactory();
		//see if getCreditService method correctly return an TransUnion class
		assertEquals(shouldBeTransUnion.getCreditService("transUnion").getClass(),TransUnion.class);
	}
	@Test
	public void wrongSpellingNotMAtchingToThreeCreditTypesShouldReturnNull() {
		CreditScoreFactory shouldBeNull = new CreditScoreFactory();
		//getCreditService should return null if the spelling does not match the three credit services
		assertNull(shouldBeNull.getCreditService("equifx"));
		
	}
}
