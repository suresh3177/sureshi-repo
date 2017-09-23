package com.habitat.dao;

import java.util.HashMap;
import java.util.Map;

import com.habitat.model.DesertHabitat;
import com.habitat.model.ForestHabitat;
import com.habitat.model.Habitat;
import com.habitat.model.PetHomeHabitat;
import com.habitat.model.WaterHabitat;

public class HabitatDAOImpl implements HabitatDAO
{

	private static final Map<String, Habitat> habitatsMap;

	static
	{
		habitatsMap = new HashMap<String, Habitat>();
		habitatsMap.put("water", new WaterHabitat("water", 2));
		habitatsMap.put("desert", new DesertHabitat("desert", 1));
		habitatsMap.put("forest", new ForestHabitat("forest", 1));
		habitatsMap.put("pethome", new PetHomeHabitat("pethome", 2));
	}

	@Override
	public Habitat findHabitatByName(String habitatName)
	{

		return habitatsMap.get(habitatName);
	}

}
