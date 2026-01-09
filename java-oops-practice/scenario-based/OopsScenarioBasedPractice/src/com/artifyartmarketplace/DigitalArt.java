package com.artifyartmarketplace;

class DigitalArt extends Artwork {

	public DigitalArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}

	public DigitalArt(String title, String artist, double price, String licenseType, boolean preview) {
		super(title, artist, price, licenseType, preview);
	}

	@Override
	public void license() {
		System.out.println("Digital License Applied: " + licenseType + " (Non-transferable, Online Use Only)");
	}
}
