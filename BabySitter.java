
public class BabySitter {
	
	public Integer getTotalNightCharge(Integer startToBed, Integer bedToMidnight, Integer midnightToEnd){
		return calculateTotalNightCharge(startToBed, bedToMidnight, midnightToEnd);
	}
	
	private Integer calculateTotalNightCharge(Integer startToBed, Integer bedToMidnight, Integer midnightToEnd){
		return (startToBed * 12) + (bedToMidnight * 8) + (midnightToEnd *16);
	}
}
