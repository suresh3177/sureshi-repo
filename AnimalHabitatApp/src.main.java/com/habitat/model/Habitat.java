package com.habitat.model;

import com.habitat.util.HabitatType;

public abstract class Habitat
{
	String name; // Habitat name
	int capacity; // Number of allowed animals.
	HabitatType type; //

	public Habitat(String name, int capacity, HabitatType type)
	{

		this.name = name;
		this.capacity = capacity;
		this.type = type;
	}

	public abstract String showHabitatDetails();

	//public abstract void showPets();

}
