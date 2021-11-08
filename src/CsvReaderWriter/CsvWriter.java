package CsvReaderWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import HotelDatabase.*;
import model.room.Room;
import model.customer.Customer;
import model.reservations.Reservation;

public class CsvWriter {
	private static Reservation reservation;

	public static void writeCsv(String filePath, Reservation x) {
		List<Reservation> users = new ArrayList<Reservation>();

		reservation = x;
		
		
		
		users.add(reservation);

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filePath);

			fileWriter.append("Name, Phone Number, Reservation Number, Reservation Type, Check-in, Check-out, Hotel, Room, Occupancy, Price\r\n");
			for(Reservation u: users) {
				fileWriter.append(u.getCustomer().getName());
				fileWriter.append(",");
				fileWriter.append(u.getCustomer().getNumber());
				fileWriter.append(",");
				fileWriter.append(u.getReservationNumber());
				fileWriter.append(",");
				fileWriter.append(u.getReservationType());
				fileWriter.append(",");
				fileWriter.append(u.getCheckInDate().getDate());
				fileWriter.append(",");
				fileWriter.append(u.getCheckOutDate().getDate());
				fileWriter.append(",");
				fileWriter.append(u.getRoom().getRoomType().getHotelType());
				fileWriter.append(",");
				fileWriter.append(u.getRoom().getRoomType().getRoomType());
				fileWriter.append(",");
				fileWriter.append(u.getRoom().getOccupancy());
				fileWriter.append(",");
				fileWriter.append(u.getPrice());
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