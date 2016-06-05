
public class Hours {
	private Integer startTime;
	private Integer bedTime;
	private Integer endTime;
	
	//Parameterized Constructor
	Hours(Integer newStartTime, Integer newBedTime, Integer newEndTime){
		startTime = newStartTime;
		bedTime = newBedTime;
		endTime = newEndTime;
	}
	
	//get
	public Integer getStartTime(){
		return startTime;
	}
	public Integer getBedTime(){
		return bedTime;
	}
	public Integer getEndTime(){
		return endTime;
	}
	
	//Set
	public void setStartTime(Integer newStartTime){
		startTime = newStartTime;
	}
	public void setBedTime(Integer newBedTime){
		bedTime = newBedTime;
	}
	public void setEndTime(Integer newEndTime){
		endTime = newEndTime;
	}

	//
	public Integer getStartToBedHours(){
		return calculateHoursFromStartToBedTime();
	}
	private Integer calculateHoursFromStartToBedTime(){
		Integer result = 0;
		if(startTime < bedTime)
			result = bedTime - startTime;
		return result;
	}
	
	
}

