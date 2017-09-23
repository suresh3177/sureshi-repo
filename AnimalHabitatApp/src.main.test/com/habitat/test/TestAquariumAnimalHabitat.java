package com.habitat.test;

import com.habitat.model.Animal;
import com.habitat.model.Cat;
import com.habitat.model.DesertHabitat;
import com.habitat.model.Dog;
import com.habitat.model.Eagle;
import com.habitat.model.ForestHabitat;
import com.habitat.model.GilaMonster;
import com.habitat.model.GoldFish;
import com.habitat.model.PetHomeHabitat;
import com.habitat.model.Turtle;
import com.habitat.model.WaterHabitat;
import com.habitat.service.HabitatService;
import com.habitat.service.HabitatServiceImpl;

public class TestAquariumAnimalHabitat
{

	private static Animal[] animals = new Animal[10];

	static
	{
		animals[0] = new Dog("dogX", "pethome");
		animals[1] = new Cat("catY", "pethome");
		animals[2] = new GilaMonster("GilaMonsterZ", "desert");
		animals[3] = new Turtle("TurtleM", "water");
		animals[4] = new GoldFish("GoldFish", "water");
		animals[5] = new Eagle("Eagle", "forest");
	}

	public static void main(String arg[])
	{

		HabitatService habitatService = new HabitatServiceImpl();

		PetHomeHabitat petHabitat = (PetHomeHabitat) habitatService.findHabitatByName("pethome");
		DesertHabitat desertHabitat = (DesertHabitat) habitatService.findHabitatByName("desert");
		WaterHabitat waterHabitat = (WaterHabitat) habitatService.findHabitatByName("water");
		ForestHabitat forestHabitat = (ForestHabitat) habitatService.findHabitatByName("forest");

		for (Animal animal : animals)
		{

			if (animal instanceof Dog)
			{

				PetHomeHabitat.petHomeAnimals[0] = animal;
			} else if (animal instanceof Cat)
			{
				PetHomeHabitat.petHomeAnimals[1] = animal;
			} else if (animal instanceof GilaMonster)
			{
				DesertHabitat.desertAnimals[0] = animal;
			} else if (animal instanceof Turtle)
			{

				WaterHabitat.waterAnimals[0] = animal;

			} else if (animal instanceof GoldFish)
			{

				WaterHabitat.waterAnimals[1] = animal;

			} else if (animal instanceof Eagle)
			{
				ForestHabitat.forestAnimals[0] = animal;
			}
		}

		petHabitat.showPetHomeAnimals();
		petHabitat.showHabitatDetails();
		desertHabitat.showDesertAnimal();
		desertHabitat.showHabitatDetails();
		waterHabitat.showWaterAnimals();
		waterHabitat.showHabitatDetails();
		forestHabitat.showForestAnimal();
		forestHabitat.showHabitatDetails();

	}

}
