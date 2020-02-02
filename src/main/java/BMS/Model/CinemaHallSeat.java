package BMS.Model;

public class CinemaHallSeat {
	private String rowNumber;
	private String ColumnNumber;
	private SeatType Type;

	public String getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(String rowNumber) {
		this.rowNumber = rowNumber;
	}

	public String getColumnNumber() {
		return ColumnNumber;
	}

	public void setColumnNumber(String columnNumber) {
		ColumnNumber = columnNumber;
	}
}
