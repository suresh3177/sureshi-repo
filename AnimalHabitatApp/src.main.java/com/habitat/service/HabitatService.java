package com.habitat.service;

import com.habitat.model.Animal;
import com.habitat.model.Habitat;

public interface HabitatService
{

	public Habitat findHabitatByName(String name);

	public void allowAnimalToHabitat(Animal animal);
}
