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
	
	@Test
	public void WhenHoursIsGivenEndTimeThreeItReturnsThree(){
		Hours hours = new Hours(1, 2, 3);
		assertEquals("3", hours.getEndTime().toString());
	}
	
	@Test
	public void CalculateHoursFromStartTime7ToBedTimeTenGot3(){
		Hours hours = new Hours(7, 10, 0);
		assertEquals("3", hours.getStartToBedHours().toString());
	}

	
	
}