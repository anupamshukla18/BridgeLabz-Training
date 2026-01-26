package com.annotations.exerciseproblems.customannotation;

import java.lang.reflect.Method;

public class MainApp {

	public static void main(String[] args) {

		try {
			Class<TaskManager> cls = TaskManager.class;

			Method method = cls.getMethod("completeTask");

			if (method.isAnnotationPresent(TaskInfo.class)) {
				TaskInfo info = method.getAnnotation(TaskInfo.class);

				System.out.println("Priority: " + info.priority());
				System.out.println("Assigned To: " + info.assignedTo());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
