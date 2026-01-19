package com.generics.resumescreening;

class ScreeningUtil {

	public static <T extends Resume<?>> void screen(T resume) {
		System.out.println(resume.getCandidateName() + " → " + resume.getJobRole().getRoleName() + " | "
				+ resume.getJobRole().evaluate());
	}
}
