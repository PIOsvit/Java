/**
 * @author dkopic & Josip Perak & Ivan Greguric
 */
package print;

import farm.animal.animalVariables.AverageFoodConsumption;
import farm.animal.animalVariables.Benefit;
import farm.animal.animalVariables.Condition;
import farm.animal.animalVariables.FoodType;
import farm.animal.animalVariables.Genre;
import farm.animal.animalVariables.Productivity;
import farm.animal.animalVariables.Reproduction;
import farm.animal.setAnimal.SetChicken;
import farm.animal.setAnimal.SetCow;
import farm.animal.setAnimal.SetPig;
import farm.animal.theAnimal.Chicken;
import farm.animal.theAnimal.Cow;
import farm.animal.theAnimal.Pig;
import farm.personnel.setPersonnel.SetFarmWorker;
import farm.personnel.setPersonnel.SetVeterinarian;
import farm.personnel.thePersonnel.FarmWorker;
import farm.personnel.thePersonnel.Veterinarian;

public class Print {

	public static void main(String[] args) {

		Cow[] cowArray = new Cow[10];

		for (int i = 0; i < cowArray.length; i++) {

			float randomDailyFoodConsumption = 10 + (float) (Math.random() * 25f);
			float randomDailyBenefit = 10 + (float) (Math.random() * 25f);
			float randomAnnualBenefit = randomDailyBenefit * 200
					+ (float) (Math.random() * 1000f);
			int randomAge = 1 + (int) (Math.random() * 5);
			float randomMass = randomAge * 100 + (float) (Math.random() * 30f);
			float randomHealthCostPerYear = 50 + (float) (Math.random() * 250f);
			boolean randomReproductNow = Math.random() < 0.1;
			int randomReproduction = 0;
			if (randomAge > 1) {
				randomReproductNow = Math.random() < 0.1;
				randomReproduction = (int) (1 + (Math.random() * 2));
			} else {
				randomReproductNow = false;
				randomReproduction = 0;
			}
			boolean desseas = false;
			if (randomReproductNow == true) {
				randomDailyBenefit = 0;
			}
			if (randomDailyBenefit < 15 && randomReproductNow == false) {
				desseas = true;
			}

			cowArray[i] = SetCow.setCow(1001 + i, new AverageFoodConsumption(
					FoodType.SILAGE, randomDailyFoodConsumption, true),
					new Productivity(randomDailyBenefit, randomAnnualBenefit,
							Benefit.MILK), new Condition(randomAge, randomMass,
							Genre.FEMALE, randomHealthCostPerYear, false,
							desseas), new Reproduction(randomReproductNow,
							randomReproduction), true);
		}
		for (int i = 0; i < cowArray.length; i++) {
			System.out.println(cowArray[i]);

		}

		System.out.println();

		Pig[] pigArray = new Pig[10];

		for (int i = 0; i < pigArray.length; i++) {

			float randomDailyFoodConsumption = 7 + (float) (Math.random() * 5f);
			float randomDailyBenefit = (float) (0.5 + (float) (Math.random() * 2f));
			float randomAnnualBenefit = 40 + (float) (Math.random() * 20f);
			int randomAge = 1 + (int) (Math.random() * 4);
			float randomMass = randomAge * randomAnnualBenefit
					+ (float) (Math.random() * 30f);
			float randomHealthCostPerYear = 10 + (float) (Math.random() * 50f);
			byte randomFat = (byte) (21 + (Math.random() * 8));
			boolean randomReproductNow = Math.random() < 0.5;
			int randomReproduction = 0;
			if (randomAge > 1) {
				randomReproductNow = Math.random() < 0.1;
				randomReproduction = (int) (8 + (Math.random() * 5));
			} else {
				randomReproductNow = false;
				randomReproduction = 0;
			}
			boolean desseas = false;
			if (randomDailyBenefit < 0.7) {
				desseas = true;
			}

			pigArray[i] = SetPig.setPig(2001 + i, new AverageFoodConsumption(
					FoodType.PIG_FEED, randomDailyFoodConsumption, true),
					new Productivity(randomDailyBenefit, randomAnnualBenefit,
							Benefit.MEAT), new Condition(randomAge, randomMass,
							Genre.FEMALE, randomHealthCostPerYear, false,
							desseas), new Reproduction(randomReproductNow,
							randomReproduction), randomFat);
		}
		for (int i = 0; i < pigArray.length; i++) {
			System.out.println(pigArray[i]);

		}

		System.out.println();

		Chicken[] chickenArray = new Chicken[10];

		for (int i = 0; i < chickenArray.length; i++) {

			float randomDailyFoodConsumption = 0.1f + (float) (Math.random() * 0.2f);
			int randomDailyBenefit = (int) (Math.random() * 3);
			float randomAnnualBenefit = 180 + (float) (Math.random() * 200f);
			int randomAge = 1 + (int) (Math.random() * 3);
			float randomMass = 2 + (float) (Math.random() * 2f);
			float randomHealthCostPerYear = 1 + (float) (Math.random() * 5f);
			boolean desseas = false;

			chickenArray[i] = SetChicken.setChicken(3001 + i,
					new AverageFoodConsumption(FoodType.CHICKEN_FEED,
							randomDailyFoodConsumption, true),
					new Productivity(randomDailyBenefit, randomAnnualBenefit,
							Benefit.EGG), new Condition(randomAge, randomMass,
							Genre.FEMALE, randomHealthCostPerYear, false,
							desseas), new Reproduction(false, 0));
		}
		for (int i = 0; i < chickenArray.length; i++) {
			System.out.println(chickenArray[i]);

		}
		System.out.println();

		FarmWorker[] farmWorkerArray = new FarmWorker[16];

		for (int i = 0; i < farmWorkerArray.length; i++) {

			int randomOperatingHoursPerMonth = 140 + (int) (Math.random() * 20);
			int randomOperatingHoursPerDay = 4 + (int) (Math.random() * 6);
			float salary = randomOperatingHoursPerMonth * 20.4f;
			boolean randomIsWorking = Math.random() < 0.5;

			farmWorkerArray[i] = SetFarmWorker.setFarmworker(
					randomOperatingHoursPerMonth, randomOperatingHoursPerDay,
					salary, FarmWorker.NUMBER_VACATION_DAYS, randomIsWorking);
		}
		
		for (int i = 0; i < farmWorkerArray.length; i++) {
			System.out.println(farmWorkerArray[i]);
		}
		
		Veterinarian[] veterinarianArray = new Veterinarian[18];

		for (int i = 0; i < veterinarianArray.length; i++) {

			int randomOperatingHoursPerMonth = 80 + (int) (Math.random() * 30);
			int randomOperatingHoursPerDay = 3 + (int) (Math.random() * 3);
			float salary = randomOperatingHoursPerMonth * 30.6f;
			int randomNumberOfVaccines = 10 + (int) (Math.random() * 20);
			int randomNumberOfCuredAnimals = 10 + (int) (Math.random() * 40);
			boolean randomIsWorking = Math.random() < 0.5;

			veterinarianArray[i] = SetVeterinarian.setVeterinarian(
					randomOperatingHoursPerMonth, randomOperatingHoursPerDay,
					salary, randomNumberOfVaccines, randomNumberOfCuredAnimals,
					randomIsWorking);
		}

		for (int i = 0; i < veterinarianArray.length; i++) {
			System.out.println(veterinarianArray[i]);
		}
	}
}
