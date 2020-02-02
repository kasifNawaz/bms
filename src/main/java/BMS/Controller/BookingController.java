package BMS.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import BMS.Model.Movie;
import BMS.Model.Ticket;
import BMS.Service.BookingService;
import BMS.Service.SearchServices;

@RestController
public class BookingController {

	private BookingService bookingService;
	private SearchServices SearchServiceImpl;

	public BookingController(BookingService bookingService, SearchServices SearchServiceImpl) {
		this.bookingService = bookingService;
		this.SearchServiceImpl = SearchServiceImpl;
	}

	@RequestMapping("/getticketbycount")
	public Ticket getTicketByCount(@RequestParam(value = "count", defaultValue = "1") int count) {
		Movie movie = new Movie();
		var shows = movie.getShows();
		Ticket ticket = this.bookingService.makeBooking(count, shows.get(0));
		return ticket;
	}

	@RequestMapping("/getmoviebyName")
	public List<Movie> getMovieByName(@RequestParam(value = "name", defaultValue = "pk") String name) {

		var movie = this.SearchServiceImpl.searchByTitle(name);
		return movie;
	}

}
