package model.reservations;
import org.junit.validator.PublicClassValidator;

import DateAndTime.Date;
import model.room.Room;
import model.customer.*;

public class Reservation {
	private int reservationNumber;
	private Customer customer;
	private String reservationType;
	private Date checkInDate;
	private Date checkOutDate;
	private int numberOfRooms;
	private Room roomType;
	private double totalCost;
	
	public Reservation(Customer customer, String reservationType, Date checkInDate, Date checkOutDate, int numberOfRooms, Room roomType, double totalCost) {
		this.customer = customer;
		this.reservationType = reservationType;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomType = roomType;
		this.numberOfRooms = numberOfRooms;
		this.reservationNumber = (int)(Math.random() * 1000 + 8999 );
		if(reservationType.equals("S")){
			this.totalCost = totalCost*numberOfRooms;
		}else if(reservationType.equals("AP")) {
			this.totalCost = (totalCost - totalCost*(0.05)) * numberOfRooms;
		}
		
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public String getReservationType() {
		return reservationType;
	}
	
	public String getReservationNumber() {
		return Integer.toString(reservationNumber);
	}
	
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	
	public Date getCheckInDate() {
		return checkInDate;
	}
	
	public Room getRoom() {
		return roomType;
	}
	
	public String getPrice() {
		return Double.toString(totalCost);
	}
	
	@Override
	public String toString() {
		return customer.toString() + "\r\n" +
			   "ReservationType: " + reservationType + "\r\n" +
			   checkInDate.toString() + "\r\n" +
			   checkOutDate.toString() + "\r\n" +
			   "Number Of Rooms: " + numberOfRooms + "\r\n" +
			   "Room: " + roomType.toString() + "\r\n";
	
	}
}
