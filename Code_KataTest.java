import static org.junit.Assert.*;

import org.junit.Test;

public class Code_KataTest {

	@Test
	public void WhenHoursIsGivenStartTimeOneItReturnsOne(){
		Hours hours = new Hours(1, 0, 0);
		assertEquals("1", hours.getStartTime().toString());
	}
	
	@Test
	public void WhenHoursIsGivenBedTimeTwoItReturnsTwo(){
		Hours hours = new Hours(1, 2, 0);
		assertEquals("2", hours.getBedTime().toString());
	}

	
	
}