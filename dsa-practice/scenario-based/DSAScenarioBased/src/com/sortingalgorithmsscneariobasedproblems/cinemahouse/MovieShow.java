package com.sortingalgorithmsscneariobasedproblems.cinemahouse;

public class MovieShow {

	private String movieName;
	private int showTime; // time in 24-hour format (e.g., 1430 = 2:30 PM)

	public MovieShow(String movieName, int showTime) {
		this.movieName = movieName;
		this.showTime = showTime;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getShowTime() {
		return showTime;
	}

	@Override
	public String toString() {
		return movieName + " at " + showTime;
	}
}
