package movieTheaterManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static ArrayList<Theater> theaters = new ArrayList<>();
	static ArrayList<Movie> movieList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Movie m1 = new Movie(1, "RRR", "Action", 3.0, 95);
		Movie m2 = new Movie(2, "Pushpa: The Rise", "Action", 2.97, 90);
		Movie m3 = new Movie(3, "Baahubali: The Beginning", "Action", 2.87, 92);
		Movie m4 = new Movie(4, "Arjun Reddy", "Romantic", 2.58, 88);
		Movie m5 = new Movie(5, "Jersey", "Romantic", 2.67, 89);
		Movie m6 = new Movie(6, "Ala Vaikunthapurramuloo", "Comedy", 2.75, 85);
		Movie m7 = new Movie(7, "Eega", "Thriller", 2.42, 83);
		Movie m8 = new Movie(8, "Magadheera", "Action", 2.77, 91);
		Movie m9 = new Movie(9, "Mahanati", "Romantic", 2.93, 94);
		Movie m10 = new Movie(10, "Bhoot: Part One", "Horror", 2.5, 80);

		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		movieList.add(m5);
		movieList.add(m6);
		movieList.add(m7);
		movieList.add(m8);
		movieList.add(m9);
		movieList.add(m10);

		theaters.add(new Theater(1, "Sarada Theater", Arrays.asList(m1, m2, m5, m9, m10), "Khiratabad", 3.5));
		theaters.add(new Theater(2, "Prasads Multiplex", Arrays.asList(m1, m3, m4, m6, m8), "Moosapet", 2.0));
		theaters.add(new Theater(3, "Sudarshan 35MM", Arrays.asList(m2, m4, m5, m7, m9), "Punjagutta", 4.2));
		theaters.add(new Theater(4, "Sandhya 70MM", Arrays.asList(m1, m6, m8, m10), "Irrum Manjil", 5.1));
		theaters.add(new Theater(5, "Devi 70MM", Arrays.asList(m3, m5, m7, m9, m10), "Dilshukh Nagar", 6.0));
		theaters.add(new Theater(6, "Mallikarjuna Theater", Arrays.asList(m1, m2, m6, m8), "Kondapur", 4.7));
		theaters.add(new Theater(7, "Shanti Theater", Arrays.asList(m2, m3, m4, m9, m10), "Madhapur", 5.8));
		theaters.add(new Theater(8, "Venkatadri Theater", Arrays.asList(m5, m6, m7, m8, m9), "Balanagar", 6.2));
		theaters.add(new Theater(9, "Saptagiri Theater", Arrays.asList(m1, m3, m7, m10), "Balapur", 7.0));
		theaters.add(new Theater(10, "Ramakrishna Theater", Arrays.asList(m2, m4, m6, m8, m9), "Mehedipatnam", 6.5));

		int choice;
		do {
			System.out.println(" ***********   Welcome to Theater Management Application *************");
			System.out.println("Available Services");
			System.out.println("1. Lowest Duration Movie In the Given Theater ");
			System.out.println("2. Highest Duration Movie In the Given Theater ");
			System.out.println("3. Lowest Distance Theater ");
			System.out.println("4. Highest Distance Theater ");
			System.out.println("5. Second Maximum Ticket cost In the Given Theater ");
			System.out.println("6. Lowest Ticket Cost Movie In the Given Theater ");
			System.out.println("7. Highest Ticket Cost Movie In the Given Theater ");
			System.out.println("8. Sort The Theaters in Ascending Order Based On the Distance ");
			System.out.println("9. Sort The Theaters in Descending Order Based On the Distance ");
			System.out.println("10. Sort The Movies in Ascending Order Based On the Ticket Cost ");
			System.out.println("11. Sort The Movies in Descending Order Based On the Ticket Cost ");
			System.out.println("12. Sort The Movies in Ascending Order Based On the Title ");
			System.out.println("13. Sort The Movies in Descending Order Based On the Title ");
			System.out.println("14. List The Movies Based On the Given Genre ");
			System.out.println("0. Cancel");

			System.out.println("Choose Your option");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				System.out.println("Enter Theater Name ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println(lowestDurationMovie(name));
			}
			case 2 -> {
				System.out.println("Enter Theater Name ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println(highestDurationMovie(name));
			}
			case 3 -> {
				System.out.println(lowestDistanceTheater());
			}
			case 4 -> {
				System.out.println(highestDistanceTheater());
			}
			case 5 -> {
				System.out.println("Enter Theater Name ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println(secondMaxTicketCost(name));
			}
			case 6 -> {
				System.out.println("Enter Theater Name ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println(lowestTicketCostMovie(name));
			}
			case 7 -> {
				System.out.println("Enter Theater Name ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println(highestTicketCostMovie(name));
			}
			case 8 -> {
				theaters.sort((o1, o2) -> Double.compare(o1.getLocationDistance(), o2.getLocationDistance()));
				theaters.forEach(System.out::println);
			}
			case 9 -> {
				theaters.sort((o1, o2) -> Double.compare(o2.getLocationDistance(), o1.getLocationDistance()));
				theaters.forEach(System.out::println);
			}
			case 10 -> {
				movieList.sort(Comparator.comparingDouble(Movie::getTicketPrice));
				movieList.forEach(System.out::println);
			}
			case 11 -> {
				movieList.sort((a, b) -> Double.compare(b.getTicketPrice(), a.getTicketPrice()));
				movieList.forEach(System.out::println);
			}
			case 12 -> {
				movieList.sort(Comparator.comparing(Movie::getTitle));
				movieList.forEach(System.out::println);
			}
			case 13 -> {
				movieList.sort(Comparator.comparing(Movie::getTitle).reversed());
				movieList.forEach(System.out::println);
			}
			case 14 -> {
				System.out.println("Enter Genre");
				sc.nextLine();
				String genre = sc.nextLine();
				List<Movie> m = moviesBasedOnGenre(genre);
				if (m.isEmpty()) {
					System.out.println("No Movies Found With The Given Genre " + genre);
				} else {
					for (Movie movie : m) {
						System.out.println(movie);
					}
				}
			}
			default -> {
				if (choice != 0)
					System.out.println("Invalid Option !!!");
			}
			}
		} while (choice != 0);
		System.out.println(
				choice == 0 ? "************* Thanks For Using The Theater Management Application  **************" : "");
	}

	public static String lowestDurationMovie(String theaterName) {
		for (Theater t : theaters) {
			if (t.getName().equalsIgnoreCase(theaterName)) {
				List<Movie> movies = t.getMovies();
				movies.sort((a, b) -> Double.compare(a.getDuration(), b.getDuration()));
				Movie m = movies.get(0);
				return m.getTitle() + " with duration -> " + m.getDuration();
			}
		}
		return "Theater not found with given name " + theaterName;
	}

	public static String highestDurationMovie(String theaterName) {
		for (Theater t : theaters) {
			if (t.getName().equalsIgnoreCase(theaterName.trim())) {
				List<Movie> movies = t.getMovies();
				movies.sort((a, b) -> Double.compare(b.getDuration(), a.getDuration()));
				Movie m = movies.get(0);
				return m.getTitle() + " with duration -> " + m.getDuration();
			}
		}
		return "Theater not found with given name " + theaterName;
	}

	public static String lowestDistanceTheater() {
		theaters.sort(Comparator.comparingDouble(Theater::getLocationDistance));
		return theaters.get(0).getName() + " with distance " + theaters.get(0).getLocationDistance();
	}

	public static String highestDistanceTheater() {
		theaters.sort(Comparator.comparingDouble(Theater::getLocationDistance).reversed());
		return theaters.get(0).getName() + " with distance " + theaters.get(0).getLocationDistance();
	}

	public static String secondMaxTicketCost(String theaterName) {
		for (Theater t : theaters) {
			if (t.getName().equalsIgnoreCase(theaterName)) {
				List<Movie> movies = t.getMovies();
				movies.sort((a, b) -> Double.compare(b.getTicketPrice(), a.getTicketPrice()));
				Movie movie = movies.get(1);
				return "The second maximum ticket cost in the " + t.getName() + " is " + movie.getTicketPrice();
			}
		}
		return "Theater not found with given name " + theaterName;
	}

	public static String lowestTicketCostMovie(String theaterName) {
		for (Theater t : theaters) {
			if (t.getName().equalsIgnoreCase(theaterName)) {
				List<Movie> movies = t.getMovies();
				movies.sort((a, b) -> Double.compare(a.getTicketPrice(), b.getTicketPrice()));
				Movie movie = movies.get(0);
				return "The lowest ticket cost movie in the " + t.getName() + " is " + movie.getTitle();
			}
		}
		return "Theater not found with given name " + theaterName;
	}

	public static String highestTicketCostMovie(String theaterName) {
		for (Theater t : theaters) {
			if (t.getName().equalsIgnoreCase(theaterName)) {
				List<Movie> movies = t.getMovies();
				movies.sort((a, b) -> Double.compare(b.getTicketPrice(), a.getTicketPrice()));
				Movie movie = movies.get(0);
				return "The highest ticket cost movie in the " + t.getName() + " is " + movie.getTitle();
			}
		}
		return "Theater not found with given name " + theaterName;
	}

	public static List<Movie> moviesBasedOnGenre(String genre) {
		List<Movie> movies = new ArrayList<>();
		for (Movie m : movieList) {
			if (m.getGenre().equalsIgnoreCase(genre)) {
				movies.add(m);
			}
		}
		return movies;
	}
}
