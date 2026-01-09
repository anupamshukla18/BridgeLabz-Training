package com.artifyartmarketplace;

class PrintArt extends Artwork {

	public PrintArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}

	public PrintArt(String title, String artist, double price, String licenseType, boolean preview) {
		super(title, artist, price, licenseType, preview);
	}

	@Override
	public void license() {
		System.out.println("Print License Applied: " + licenseType + " (Limited Physical Copies Allowed)");
	}
}
