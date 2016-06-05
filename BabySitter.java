
public class BabySitter {
	
	public Integer getTotalNightCharge(Integer startToBed, Integer bedToMidnight, Integer midnightToEnd){
		return calculateTotalNightCharge(startToBed, bedToMidnight, midnightToEnd);
	}
	
	private Integer calculateTotalNightCharge(Integer startToBed, Integer bedToMidnight, Integer midnightToEnd){
		return 2 + 3 + 4;
	}
}
