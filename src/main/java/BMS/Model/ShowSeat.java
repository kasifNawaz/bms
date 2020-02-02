package BMS.Model;

public class ShowSeat extends CinemaHallSeat {
	private int showSeatId;
	private boolean isReserved;
	private double price;

	public Integer getShowSeatId() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}