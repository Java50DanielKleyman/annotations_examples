package telran.x;

import telran.reflect.Id;
import telran.reflect.Index;

public class PersonNormal {
	@Id
	public int id = 12345;
	@Index
	public String name = "David";
	@Index
	public String surName = "Pupkin";
}
