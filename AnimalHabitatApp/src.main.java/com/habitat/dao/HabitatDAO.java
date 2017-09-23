package com.habitat.dao;

import com.habitat.model.Habitat;

public interface HabitatDAO
{
	public Habitat findHabitatByName(String habitatName);

}
