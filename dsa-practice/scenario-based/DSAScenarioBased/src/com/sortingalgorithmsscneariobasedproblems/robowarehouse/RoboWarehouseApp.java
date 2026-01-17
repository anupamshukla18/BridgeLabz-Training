package com.sortingalgorithmsscneariobasedproblems.robowarehouse;

public class RoboWarehouseApp {
	public static void main(String[] args) {

		ShelfManager manager = new ShelfManager();

		// shelf with fixed capacity (demo)
		PackageItem[] shelf = new PackageItem[10];
		int size = 0;

		// robot loads packages one by one
		shelf[size++] = new PackageItem(25);
		manager.insertPackage(shelf, size);

		shelf[size++] = new PackageItem(10);
		manager.insertPackage(shelf, size);

		shelf[size++] = new PackageItem(40);
		manager.insertPackage(shelf, size);

		shelf[size++] = new PackageItem(20);
		manager.insertPackage(shelf, size);

		shelf[size++] = new PackageItem(15);
		manager.insertPackage(shelf, size);

		System.out.println("Shelf Order (Ascending by Weight):");
		manager.displayShelf(shelf, size);
	}
}
