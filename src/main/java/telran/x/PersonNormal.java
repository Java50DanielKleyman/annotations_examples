package telran.x;

import telran.reflect.Id;
import telran.reflect.Index;

public class PersonNormal {
	@Id
	public static int id = 12345;
	@Index
	public static String name = "David";
	@Index
	public static String surName = "Pupkin";
}
