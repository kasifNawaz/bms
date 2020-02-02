package BMS.Model;

import java.util.Date;
import java.util.List;

public class Booking {
	private String bookingNumber;
	private int numberOfSeats;
	private Date createdOn;
	private BookingStatus status;

	private Show show;
	private List<ShowSeat> seats;
	private Payment payment;

	public boolean makePayment(Payment payment) {
		return false;
	}

	public boolean cancel() {
		return false;
	}

	public boolean assignSeats(List<ShowSeat> seats) {
		return false;

	}

	public List<ShowSeat> getSeats() {
		// TODO Auto-generated method stub
		return null;
	}
}
