import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvWriter {


	public static void writeCsv(String filePath, String hotelType, String roomType, String numOfRooms, String minOccup, String maxOccup, String rates) {
		List<Room> users = new ArrayList<Room>();

		//create demo Users
		Room room = new Room();
		room.setHotelType(hotelType);
		room.setRoomType(roomType);
		room.setNumOfRooms(numOfRooms);
		room.setMinOccup(minOccup);
		room.setMaxOccup(maxOccup);
		room.setTotalRate(rates);
		
		users.add(room);

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filePath);

			fileWriter.append("Hotel type, Room type, Number of Rooms, Occupancy-min, Occupancy-max, Rates\r\n");
			for(Room u: users) {
				fileWriter.append(u.getHotelType());
				fileWriter.append(",");
				fileWriter.append(u.getRoomType());
				fileWriter.append(",");
				fileWriter.append(u.getNumRooms());
				fileWriter.append(",");
				fileWriter.append(u.getMinOccup());
				fileWriter.append(",");
				fileWriter.append(u.getMaxOccup());
				fileWriter.append(",");
				fileWriter.append(u.getTotalRate());
				fileWriter.append("\n");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}