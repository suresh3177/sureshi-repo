package com.habitat.service;

import com.habitat.dao.HabitatDAO;
import com.habitat.dao.HabitatDAOImpl;
import com.habitat.model.Animal;
import com.habitat.model.Habitat;

public class HabitatServiceImpl implements HabitatService
{
	HabitatDAO habitatDAO;

	@Override
	public Habitat findHabitatByName(String name)
	{
		habitatDAO = new HabitatDAOImpl();

		return habitatDAO.findHabitatByName(name);
	}

	@Override
	public void allowAnimalToHabitat(Animal animal)
	{
		// TODO Auto-generated method stub

	}

}
