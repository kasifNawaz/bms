package BMS.Model;

import java.util.Date;

public class Ticket {
	private int showId;
	private String name;
	private Address location;
	private double amount;
	private Date createdOn;
	private String Movietitle;
	private String seats;

	public Ticket(int showId, String name, Address location, double amount, String seats) {
		this.showId = showId;
		this.name = name;
		createdOn = new Date();
		this.location = location;
		this.amount = amount;
		this.seats = seats;
	}
}
