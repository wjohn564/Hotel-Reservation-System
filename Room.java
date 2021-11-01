import java.util.*;
public class Room {
	private String hotelType;
	private String roomType;
	private String numberOfRooms;
	private String minOccupancy;
	private String maxOccupancy;
	private String mondayRates;
	private String tuesdayRates;
	private String wednesdayRates;
	private String thursdayRates;
	private String fridayRates;
	private String saturdayRates;
	private String sundayRates;
	private String totalRates;
	
	public String getHotelType() {
		return hotelType;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public String getNumRooms() {
		return numberOfRooms;
	}
	
	public String getMinOccup() {
		return minOccupancy;
	}
	
	public String getMaxOccup() {
		return maxOccupancy;
	}
	
	public String getMondayRates(){
		return mondayRates;
	}
	
	public String getTuesdayRates() {
		return tuesdayRates;
	}
	
	public String getWednesdayRates() {
		return wednesdayRates;
	}
	
	public String getThursdayRates() {
		return thursdayRates;
	}
	
	public String getFridayRates() {
		return fridayRates;	
	}
	
	public String getSaturdayRates() {
		return saturdayRates;
	}
	
	public String getSundayRates() {
		return sundayRates;
	}
	
	public String getTotalRate() {
		return totalRates;
	}
	
	public void setHotelType(String stars) {
		this.hotelType = stars;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public void setNumOfRooms(String num) {
		this.numberOfRooms = num;
	}
	
	public void setMinOccup(String minOccup) {
		this.minOccupancy = minOccup;
	}
	
	public void setMaxOccup(String maxOccup) {
		this.maxOccupancy = maxOccup;
	}
	
	public void setMondayRates(String rates) {
		this.mondayRates = rates;
	}
	
	public void setTuesdayRates(String rates) {
		this.tuesdayRates = rates;
	}
	
	public void setWednesdayRates(String rates) {
		this.wednesdayRates = rates;
	}
	
	public void setThursdayRates(String rates) {
		this.thursdayRates = rates;
	}
	
	public void setFridayRates(String rates) {
		this.fridayRates = rates;
	}
	
	public void setSaturdayRates(String rates) {
		this.saturdayRates = rates;
	}
	
	public void setSundayRates(String rates) {
		this.sundayRates = rates;
	}
	
	public void setTotalRate(String rates) {
		this.totalRates = rates;
	}

}
