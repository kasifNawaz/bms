package BMS.Service;

import BMS.Model.Customer;
import BMS.Model.Movie;
import BMS.Model.PaymentStatus;
import BMS.Model.Show;
import BMS.Model.Ticket;

public class BookingService {

	private PaymentService paymentService;
	private Customer customer;

	public BookingService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public Movie searchMovieByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public synchronized Ticket makeBooking(int count, Show show) {

		var hall = show.getPlayedAt();
		var tempBooked = hall.isAvailble(count, customer);
		if (tempBooked != null) {
			var amt=100 * tempBooked.size();
			var ps = paymentService.MakePayment(amt, customer);
			if (ps == PaymentStatus.COMPLETED) {
              
				return new Ticket(show.getShowId(),show.getMovie().getTitle(),show.getPlayedAt().getAddress(), amt,"A1 ,A2, A3");
			}

		} else {
			return null;
		}

		return null;
	}
}
