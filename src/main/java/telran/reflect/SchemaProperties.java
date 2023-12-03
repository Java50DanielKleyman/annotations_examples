package telran.reflect;

import java.lang.reflect.Method;

public class SchemaProperties {
	public static void displayFieldProperties(Object obj) throws Exception {
		Method[] methods = obj.getClass().getDeclaredMethods();
		Method getIdField = getIdField(methods);
		getIdField.invoke(obj);
		for (Method method : methods) {
			if (method.isAnnotationPresent(Index.class)) {
				method.setAccessible(true);
				method.invoke(obj);
			}
		}

	}

	private static Method getIdField(Method[] methods) throws Exception {
		Method getIdField = null;
		for (Method method : methods) {
			if (getIdField == null && method.isAnnotationPresent(Id.class)) {
				getIdField = method;
				method.setAccessible(true);
			} else if (getIdField != null && method.isAnnotationPresent(Id.class)) {
				throw new IllegalStateException("“Field Id must be one");
			}
		}
		if (getIdField == null) {
			throw new IllegalStateException("No field Id found");
		}
		return getIdField;
	}
}