package telran.test;

import java.lang.reflect.Method;

import telran.reflect.BeforeEach;
import telran.reflect.Test;

public class TestLibrary {
	public static void launchTest(Object testObj) throws Exception {
		Method[] methods = testObj.getClass().getDeclaredMethods();
		Method beforeEachMethod = getBeforeEachMethod(methods);
		for (Method method : methods) {
			if (method.isAnnotationPresent(Test.class)) {
				beforeEachMethod.invoke(testObj);
				method.setAccessible(true);
				method.invoke(testObj);
			}
		}
	}

	
	private static Method getBeforeEachMethod(Method[] methods) {
		Method beforeEachMethod = null;
		for (Method method : methods) {
			if (method.isAnnotationPresent(BeforeEach.class)) {
				method.setAccessible(true);
				break;
			}
		}
		return beforeEachMethod;
	}
}
