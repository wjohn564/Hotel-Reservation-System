package model.room;
public class RoomType {
    private String hotelType;
    private String roomType;
    
    public RoomType(String hotelType, String roomType) {
    	this.hotelType = hotelType;
    	this.roomType = roomType;
    }
    
    public String getHotelType() {
    	return hotelType;
    	
    }
    
    public String getRoomType() {
    	return roomType;
    }
    
    @Override
    public String toString() {
    	return "Hotel: " + hotelType + "\r\n" +
               "Room: " + roomType + "\r\n";
    }
}
    
