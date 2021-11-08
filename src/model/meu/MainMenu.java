package model.meu;
import CsvReaderWriter.*;
import java.io.FileWriter;
import java.lang.invoke.StringConcatFactory;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.CSS;
import CsvReaderWriter.*;
import DateAndTime.Date;
import model.customer.Customer;
import model.reservations.Reservation;
import model.room.*;
import DateAndTime.Date;

public class MainMenu {
	private static Reservation reservation;

	public static void run() {
		String line = "";
		Scanner scanner = new Scanner(System.in);

		printMainMenu();

		try {
			do {
				line = scanner.nextLine();

				if (line.length() == 1) {
					switch (line.charAt(0)) {
					case '1':
						findAndReserveRoom();
						break;
					case '2':
						seeMyReservation();
						break;
					case '3':
						//modifyReservation;
						break;
					case '4':
						//cancelReservation;
						break;
					case '5':
						System.out.println("Exit");
						break;
					default:
						System.out.println("Unknown action\n");
						break;
					}
				} else {
					System.out.println("Error: Invalid action\n");
				}
			} while (line.charAt(0) != '5' || line.length() != 1);
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println("Empty input received. Exiting program...");
		}
	}

	private static void findAndReserveRoom() {
		final Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Name example John");
		String details = scanner.nextLine();

		System.out.println("Enter First Name example Doe");
		details = details + " " + scanner.nextLine();

		System.out.println("Enter Phone Number example 0892369049");
		details = details + " " + scanner.nextLine();
		Customer customer = new Customer(details);

		System.out.println("Enter Check-In Date example 26/04/2021");
		String checkIn = scanner.nextLine();
		Date checkInDate = new Date(checkIn);

		System.out.println("Enter Check-Out Date example 02/05/2021");
		String checkOut = scanner.nextLine();
		Date checkOutDate = new Date(checkOut);

		System.out.println("Would you like make a standard reservation or an advanced reservation" + "\r\n" 
				+ "A 5% discount applies to all advanced reservations but they are non-refundable" + "\r\n" +
				"Please choose Standard 'S' or Advanced Reservation 'AP' ");
		String reservationType = scanner.nextLine();

		System.out.println("Choose Occupancy (Max Occupancy is 3)");
		String occupancy = scanner.nextLine();
		
		if(occupancy.equals("3"))
			System.out.println("Only 5-star hotel accomodates 3 occupants\r\n" + "(1) 5-star hotel");
		else {
			System.out.println("(1) 5-star hotel\r\n" + 
							   "(2) 4-star hotel\r\n" +
						       "(3) 3-star hotel");
		}
		
		String num = scanner.nextLine();
		String hotelType;
		
		if(num.equals("1")) {
			hotelType = "5-star";
		}else if(num.equals("2")) {
			hotelType = "4-star";
		}else {
			hotelType = "3-star";
			
		}
		roomsAndHotels(hotelType, occupancy);
		
		String roomType = scanner.nextLine();

		RoomType r = new RoomType(hotelType, roomType);
		Room room = new Room(r, occupancy);

		reservation = new Reservation(customer, reservationType, checkInDate, checkOutDate, 1, room, 300);

		writeCsv("C:\\Users\\Tomek\\Desktop\\CS4013 Project\\Reservations.csv", reservation);

		printMainMenu();
	}


	private static void seeMyReservation() {	
		System.out.println(reservation.toString());
	}

	public static void roomsAndHotels(String hotelType, String occupancy) {
		if (hotelType.equals("5-star")) {
			if(occupancy.equals("3")) {
				System.out.println("Please choose room type: " + "\r\n"
						+ "(1) Deluxe Family\r\n");
			}else{
				System.out.println("Please choose room type: " + "\r\n"
						+ "(1) Deluxe Double\r\n"
						+ "(2) Deluxe Twin\r\n"
						+ "(3) Deluxe Single");
			}
		}else if(hotelType.equals("4-star")) {
			if(occupancy.equals("1")) {
				System.out.println("Please choose room type: " + "\r\n"
						+ "(1) Executive Single\r\n"
						+ "(2) Executive Twin\r\n"
						+ "(3) Executive Double");
			}else{        			 
				System.out.println("Please choose room type: " + "\r\n"
						+ "(1) Executive Twin\r\n"
						+ "(2) Executive Double");
			}
		}else {
			if(occupancy.equals("2")) {
				System.out.println("Please choose room type: " + "\r\n"
						+ "(1) Classic Twin\r\n"
						+ "(2) Classic Double");
			}else {
				System.out.println("Please choose room type: " + "\r\n"
						+ "(1) Classic Single");
			}
		}
	}

	public static void printMainMenu()
	{
		System.out.print("\nWelcome to the Hotel Reservation Application\n" +
				"--------------------------------------------\n" +
				"1. Find and reserve a room\n" +
				"2. See my reservations\n" +
				"3. Cancel my reservation\n" +
				"4. Exit\n" +
				"--------------------------------------------\n" +
				"Please select a number for the menu option:\n");
	}

	public static void writeCsv(String filePath, Reservation reservation) {
		List<Reservation> users = new ArrayList<Reservation>();

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


