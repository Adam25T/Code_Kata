
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
	
	//
	public Integer getBedToMidnightHours(){
		return calculateHoursFromBedTimeToMidnight();
	}
	private Integer calculateHoursFromBedTimeToMidnight(){
		Integer result = 0; 
		Integer temp = bedTime;
		if(bedTime < startTime)
			temp = startTime;
		if(temp < 12)
			result = 12 - temp;
		return result;
	}
	
	//
	public Integer getMidnightToEndHours(){
		return calculateHoursFromMidnightToEndTime();
	}
	private Integer calculateHoursFromMidnightToEndTime(){
		Integer result = 0;
		Integer temp = 12;
		if(12 < startTime)
			temp = startTime;
		if(temp < endTime)
			result = endTime - temp;
		return result;
	}
	
	
	
}

