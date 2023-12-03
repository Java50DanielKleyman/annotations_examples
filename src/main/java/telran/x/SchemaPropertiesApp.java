package telran.x;

import telran.reflect.SchemaProperties;
import telran.test.TestLibrary;

public class SchemaPropertiesApp {

	public static void main(String[] args) throws Exception {
		Xtest testObj = new Xtest();
		TestLibrary.launchTest(testObj);
		PersonNormal personNormal = new PersonNormal();
		SchemaProperties.displayFieldProperties(personNormal);
		PersonNoId personNoId = new PersonNoId();
		try {
			SchemaProperties.displayFieldProperties(personNoId);
		} catch (Exception e) {
			System.out.println(e);
		}
		PersonTwoId personTwoId = new PersonTwoId();
		try {
			SchemaProperties.displayFieldProperties(personTwoId);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}