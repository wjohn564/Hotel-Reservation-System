import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
	
	public static void main(String[] args) {
		String readFilePath = "C:\\Users\\Tomek\\Desktop\\CS4013 Project\\l4Hotels.csv";
		System.out.println("starting read user.csv file");
		  readCsv(readFilePath);
	}
	
	
	public static void readCsv(String filePath) {
		BufferedReader reader = null;

		try {
			List<Room> users = new ArrayList<Room>();
			String line = "";
			reader = new BufferedReader(new FileReader(filePath));
			reader.readLine();

			while((line = reader.readLine()) != null) {
				String[] fields = line.split(",");

				if(fields.length > 0) {
					Room user = new Room();
					user.setHotelType(fields[0]);
					user.setRoomType(fields[1]);
					user.setNumOfRooms(fields[2]);
					user.setMinOccup(fields[3]);
					user.setMaxOccup(fields[4]);
					user.setMondayRates(fields[5]);
					user.setTuesdayRates(fields[6]);
					user.setWednesdayRates(fields[7]);
					user.setThursdayRates(fields[8]);
					user.setFridayRates(fields[9]);
					user.setSaturdayRates(fields[10]);
					user.setSundayRates(fields[11]);
					users.add(user);
				}
			}

			for(Room u: users) {
				System.out.printf("[%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s,]\n",
						u.getHotelType(), u.getRoomType(), u.getNumRooms(), u.getMinOccup(), u.getMaxOccup(), u.getMondayRates(), u.getTuesdayRates(), u.getWednesdayRates(), u.getThursdayRates(), u.getFridayRates(), u.getSaturdayRates(), u.getSundayRates());
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	public static void readRates(String filePath) {
		BufferedReader reader = null;

		try {
			List<Room> users = new ArrayList<Room>();
			String line = "";
			reader = new BufferedReader(new FileReader(filePath));
			reader.readLine();

			while((line = reader.readLine()) != null) {
				String[] fields = line.split(",");

				if(fields.length > 0) {
					Room user = new Room();
					user.setMondayRates(fields[5]);
					user.setTuesdayRates(fields[6]);
					user.setWednesdayRates(fields[7]);
					user.setThursdayRates(fields[8]);
					user.setFridayRates(fields[9]);
					user.setSaturdayRates(fields[10]);
					user.setSundayRates(fields[11]);
					users.add(user);
				}
			}

			for(Room u: users) {
				System.out.printf("[%s, %s, %s, %s, %s, %s, %s]\n",
						u.getMondayRates(), u.getTuesdayRates(), u.getWednesdayRates(), u.getThursdayRates(), u.getFridayRates(), u.getSaturdayRates(), u.getSundayRates());
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
