
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
}

