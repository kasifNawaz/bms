package BMS.Model;

import java.util.List;
import java.util.stream.Collectors;

public class CinemaHall {
	private String name;
	private Address address;
	private int totalSeats;
	private int bookedSeact;
	private List<ShowSeat> seats;
	private List<Show> shows;

	public synchronized  List<ShowSeat> isAvailble(int count, Customer customer) {

		var isnotempty = count <= (totalSeats - bookedSeact);
		if (isnotempty) {
			var blokedseats = seats.stream().filter(s -> !s.isReserved()).limit(count).collect(Collectors.toList());

			for (var item : blokedseats) {
				item.setReserved(true);
			}
			return blokedseats;
		}
		return null;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
