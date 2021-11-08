package model.room;
import java.lang.invoke.StringConcatFactory;
import java.util.*;
public class Room {
	private RoomType roomType;
	private String occupancy;
	private int price;
	
	public Room(RoomType roomType, String occupancy) {
		this.roomType = roomType;
		this.occupancy = occupancy;
	}
	
	public RoomType getRoomType() {
		return roomType;
	}
	
	public String getOccupancy() {
		return occupancy;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return roomType.toString() + "\r\n" + 
	           "Occupancy: " + occupancy + "\r\n";
	}
}
