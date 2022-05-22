package credit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;



public class CreditServiceFactoryTest {
	
	
	@Test
	public void shouldReturnAnEquifaxClassWhenGetServiceIsCorrectlyCalledForEquifax(){
		CreditServiceFactory shouldBeEquifax = new CreditServiceFactory();
		//see if getCreditService method correctly return an Equifax class
		assertEquals(shouldBeEquifax.getCreditService("equifax").getClass(),EquifaxCreditService.class);
	}
	@Test
	public void shouldReturnAnExperianClassWhenGetServiceIsCorrectlyCalledForExperian(){
		CreditServiceFactory shouldBeExperian = new CreditServiceFactory();
		//see if getCreditService method correctly return an Experian class
		assertEquals(shouldBeExperian.getCreditService("experian").getClass(),ExperianCreditService.class);
	}
	@Test
	public void shouldReturnATransUnionClassWhenGetServiceIsCorrectlyCalledForTransUnion(){
		CreditServiceFactory shouldBeTransUnion = new CreditServiceFactory();
		//see if getCreditService method correctly return an TransUnion class
		assertEquals(shouldBeTransUnion.getCreditService("transUnion").getClass(),TransUnionCreditService.class);
	}
	@Test
	public void wrongSpellingNotMAtchingToThreeCreditTypesShouldReturnNull() {
		CreditServiceFactory shouldBeNull = new CreditServiceFactory();
		//getCreditService should return null if the spelling does not match the three credit services
		assertNull(shouldBeNull.getCreditService("equifx"));
		
	}
	@Test
	public void AllCapsShouldStillReturnCorrectType() {
		CreditServiceFactory allCaps = new CreditServiceFactory();
		//getCreditService should return correct object with all caps
		assertEquals(allCaps.getCreditService("EXPERIAN").getClass(),ExperianCreditService.class);
	}
}
