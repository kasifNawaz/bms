package BMS.Model;

import java.util.Date;

public class Show {
	private int showId;
	private Date createdOn;
	private Date startTime;
	private Date endTime;
	private CinemaHall playedAt;
	private Movie movie;

	public CinemaHall getPlayedAt() {
		return playedAt;
	}

	public void setPlayedAt(CinemaHall playedAt) {
		this.playedAt = playedAt;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
}
