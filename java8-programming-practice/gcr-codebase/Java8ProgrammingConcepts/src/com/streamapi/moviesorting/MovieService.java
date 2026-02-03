package com.streamapi.moviesorting;

import java.util.*;
import java.util.stream.*;

public class MovieService {

	public List<Movie> getTop5TrendingMovies(List<Movie> movies) {

		return movies.stream().filter(movie -> movie.getRating() >= 7.5) // filter good movies
				.sorted(Comparator.comparing(Movie::getRating).reversed().thenComparing(Movie::getReleaseYear)
						.reversed())
				.limit(5).collect(Collectors.toList());
	}
}
