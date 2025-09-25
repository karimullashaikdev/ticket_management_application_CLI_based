package movieTheaterManagement;

public class Movie {
	private int id;
	private String title;
	private String genre;
	private double duration;
	private double ticketPrice;

	public Movie(int id, String title, String genre, double duration, double ticketPrice) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", duration=" + duration + ", ticketPrice="
				+ ticketPrice + "]";
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public double getDuration() {
		return duration;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}
}
