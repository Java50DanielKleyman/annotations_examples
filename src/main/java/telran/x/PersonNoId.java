package telran.x;

import telran.reflect.Index;

public class PersonNoId {
	
	public int id = 12345;
	@Index
	public String name = "David";
	@Index
	public String surName = "Pupkin";
}
