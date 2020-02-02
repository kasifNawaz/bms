package BMS.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie {
	  private String title;
	  private String description;
	  private int durationInMins;
	  private String language;
	  private Date releaseDate;
	  private String country;
	  private String genre;
	  private Admin movieAddedBy;
	  private List<Show> shows;
	  public List<Show> getShows(){
		  
		  return new ArrayList<Show>();
	  }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
