//Adam Turner
public class BabySitter {
	
	public Integer getTotalNightCharge(Integer startToBed, Integer bedToMidnight, Integer midnightToEnd){
		return calculateTotalNightCharge(startToBed, bedToMidnight, midnightToEnd);
	}
	//Precondition: Takes 3 Integers representing the three sections. First parameter is 12$/hr, second parameter
	// is 8$/hr and the third parameter is 16$/hr
	//Postcondition: returns the total amount the baby sitter should be paid for the		// night in dollars
	private Integer calculateTotalNightCharge(Integer startToBed, Integer bedToMidnight, Integer midnightToEnd){
		return (startToBed * 12) + (bedToMidnight * 8) + (midnightToEnd *16);
	}
}
