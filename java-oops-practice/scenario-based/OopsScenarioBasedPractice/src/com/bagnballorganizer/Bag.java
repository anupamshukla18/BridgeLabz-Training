package com.bagnballorganizer;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Storable {
	private String id;
	private String color;
	private int capacity;
	private List<Ball> balls;

	public Bag(String id, String color, int capacity) {
		this.id = id;
		this.color = color;
		this.capacity = capacity;
		this.balls = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public String getColor() {
		return color;
	}

	public int getBallCount() {
		return balls.size();
	}

	public boolean addBall(Ball ball) {
		if (balls.size() >= capacity) {
			return false;
		}
		balls.add(ball);
		return true;
	}

	public boolean removeBall(String ballId) {
		for (Ball b : balls) {
			if (b.getId().equals(ballId)) {
				balls.remove(b);
				return true;
			}
		}
		return false;
	}

	public void displayBalls() {
		if (balls.isEmpty()) {
			System.out.println("No balls in this bag.");
			return;
		}
		for (Ball b : balls) {
			System.out.println(b);
		}
	}
}
