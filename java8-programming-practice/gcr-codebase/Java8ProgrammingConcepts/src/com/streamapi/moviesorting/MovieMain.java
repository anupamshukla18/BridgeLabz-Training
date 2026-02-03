package com.streamapi.moviesorting;

import java.util.*;

public class MovieMain {

	public static void main(String[] args) {

		List<Movie> movies = Arrays.asList(new Movie("Inception", 8.8, 2010), new Movie("Interstellar", 8.6, 2014),
				new Movie("Avatar", 7.8, 2009), new Movie("Avengers Endgame", 8.4, 2019), new Movie("Joker", 8.4, 2019),
				new Movie("Tenet", 7.4, 2020), new Movie("Dune", 8.2, 2021), new Movie("Oppenheimer", 8.9, 2023));

		MovieService service = new MovieService();

		List<Movie> topMovies = service.getTop5TrendingMovies(movies);

		topMovies.forEach(System.out::println);
	}
}
