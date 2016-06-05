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
	
	@Test
	public void CalculateHoursFromStartTime10ToBedTime8Got0(){
		Hours hours = new Hours(10, 8, 0);
		assertEquals("0", hours.getStartToBedHours().toString());
	}
	
	@Test 
	public void CalculateHoursFromBedTime8ToMidnightGot4(){
		Hours hours = new Hours(0, 8, 0);
		assertEquals("4", hours.getBedToMidnightHours().toString());
	}

	@Test
	public void CalculateHoursFromBedTimeToMidnightWhereStartTimeIsAfterBedAndMidnightShouldBeZero(){
		Hours hours = new Hours(14, 9, 0);
		assertEquals("0", hours.getBedToMidnightHours().toString());
	}
	
	
}