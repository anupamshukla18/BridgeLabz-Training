package com.sortingalgorithmsscneariobasedproblems.robowarehouse;

public class PackageItem {

	private int weight;

	// constructor
	public PackageItem(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Package Weight: " + weight;
	}
}
