package com.skh.custom.ann;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MyAnnProcessingClass {

	public static void main(String[] args) throws ClassNotFoundException {
		String classname = "com.skh.custom.ann.Employee";
//		String classname = "com.skh.custom.ann.MyAnnotation";

		Class<?> forName = Class.forName(classname);
		Annotation[] annotations = forName.getAnnotations();
		for (Annotation annotation : annotations) {
			MyAnnotation myann = (MyAnnotation) annotation;
			System.out.println("annotation : " + myann.id());
			System.out.println("annotation : " + myann.salary());
			System.out.println("annotation : " + myann.name());
			System.out.println("annotation : " + myann.method());

			// stire in DB

		}

		System.out.println("\n =========printing all fields in class===============\n");

		Field[] declaredFields = forName.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field.getName());
		}

	}

}
