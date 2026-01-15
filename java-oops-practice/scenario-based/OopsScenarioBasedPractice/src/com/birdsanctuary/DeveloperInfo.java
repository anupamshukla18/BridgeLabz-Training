package com.birdsanctuary;

import java.lang.annotation.*;

// Custom annotation to store developer details
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.TYPE) // Used on classes
public @interface DeveloperInfo {
	String developerName();

	String version();
}
