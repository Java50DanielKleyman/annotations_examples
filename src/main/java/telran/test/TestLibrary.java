package telran.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import telran.reflect.BeforeEach;
import telran.reflect.Test;

public class TestLibrary {
	public static void launchTest(Object testObj) throws Exception {
		Method[] methods = testObj.getClass().getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(Test.class)) {
				runBeforeEachMethods(testObj, methods);
				method.setAccessible(true);
				method.invoke(testObj);
			}
		}
	}

	private static void runBeforeEachMethods(Object testObj, Method[] methods)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		for (Method method : methods) {
			if (method.isAnnotationPresent(BeforeEach.class)) {
				method.setAccessible(true);
				method.invoke(testObj);
				;
			}
		}

	}
}
