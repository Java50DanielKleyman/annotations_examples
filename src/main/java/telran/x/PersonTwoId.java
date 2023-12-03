package telran.x;

import telran.reflect.Id;
import telran.reflect.Index;

public class PersonTwoId {
	@Id
	public int id = 12345;
	@Id
	public int id1 = 123456;
	@Index
	public String name = "David";
	@Index
	public String surName = "Pupkin";
}
