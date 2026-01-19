package com.generics.resumescreening;

import java.util.Arrays;
import java.util.List;

public class ResumeScreeningApp {

	public static void main(String[] args) {

		Resume<SoftwareEngineer> r1 = new Resume<>("Anuj", new SoftwareEngineer());

		Resume<DataScientist> r2 = new Resume<>("Riya", new DataScientist());

		Resume<ProductManager> r3 = new Resume<>("Karan", new ProductManager());

		ScreeningUtil.screen(r1);
		ScreeningUtil.screen(r2);
		ScreeningUtil.screen(r3);

		List<JobRole> roles = Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager());

		System.out.println("\nScreening Pipeline:");
		ScreeningPipeline.processAll(roles);
	}
}
