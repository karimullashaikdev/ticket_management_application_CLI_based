package movieTheaterManagement;

import java.util.List;

public class Theater {
	private int id;
	private String name;
	private List<Movie> movies;
	private String location;
	private double locationDistance;

	public Theater(int id, String name, List<Movie> movies, String location, double locationDistance) {
		super();
		this.id = id;
		this.name = name;
		this.movies = movies;
		this.location = location;
		this.locationDistance = locationDistance;
	}

	@Override
	public String toString() {
		return "Theater [id=" + id + ", name=" + name + ", movies=" + movies + ", location=" + location
				+ ", locationDistance=" + locationDistance + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public String getLocation() {
		return location;
	}

	public double getLocationDistance() {
		return locationDistance;
	}
}
