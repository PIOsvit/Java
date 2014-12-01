package print;

import farm.dwelling.Barn;
import farm.dwelling.Garage;
import farm.dwelling.Shed;
import farm.dwelling.Silo;
import farm.foodForAnimal.Corn;
import farm.foodForAnimal.FoodForAnimal;
import farm.foodForAnimal.Silage;
import farm.foodForAnimal.Soybean;
import farm.statistic.Statistic;
import farm.statistic.annualReport.Income;
import farm.statistic.annualReport.Outcome;
import farm.statistic.annualReport.Profit;
import farm.animalsOnFarm.AnimalsOnFarm;
import farm.animalsOnFarm.cattle.Cattle;
import farm.animalsOnFarm.pig.Pig;
import farm.animalsOnFarm.sheep.Sheep;
import farm.equipment.machines.FeederForPigs;
import farm.equipment.machines.Machines;
import farm.equipment.machines.MilkingMachine;
import farm.equipment.machines.SheepShaver;
import farm.equipment.vehicles.Harvester;
import farm.equipment.vehicles.PickUp;
import farm.equipment.vehicles.TractorWithTrailer;
import farm.equipment.vehicles.Vehicles;

public class Print {

	public static void main(String[] args) {

		System.out.println(" OUR FARM ");

		System.out.println();

		AnimalsOnFarm cattle = new Cattle(263746237l, "female", 1.3f, 145.6f);
		AnimalsOnFarm pig = new Pig(38927238l, "male", 1.1f, 95.8f);
		AnimalsOnFarm sheep = new Sheep(23489248l, "female", 0.7f, 40.6f);
		AnimalsOnFarm[] animals = new AnimalsOnFarm[3];
		animals[0] = cattle;
		animals[1] = pig;
		animals[2] = sheep;
		System.out.println(cattle.toString());
		System.out.println();
		System.out.println(pig.toString());
		System.out.println();
		System.out.println(sheep.toString());
		System.out.println();
		Machines feederForPigs = new FeederForPigs(2394832948l, "Verba",
				"for feeding pigs", 139.9f);

		System.out.println();

		System.out.println("Dwelligs");

		System.out.println();

		Barn barn = new Barn(6987654301L, 480, 50, 6);
		System.out.println("Data on barn:" + " " + barn.toString());

		System.out.println();

		Garage garage = new Garage(9876996832L, 500, 15, 2);
		System.out.println("Data on garage:" + " " + garage.toString());

		System.out.println();

		Shed shed = new Shed(1598735946L, 312, 150, 2);
		// capacity in Kg
		System.out.println("Data on shed:" + " " + shed.toString());

		System.out.println();

		Silo silo = new Silo(7531598264L, 36, 10000, 8);
		System.out.println("Data on silo:" + " " + silo.toString());

		System.out.println();

		System.out.println("Equipment on our farm:");

		System.out.println();

		Machines milkingMachines = new MilkingMachine(78345738l, "Westfalia",
				"for milk cows", 249.9f);
		Machines sheepShaver = new SheepShaver(64632647l, "Wellington",
				"for shaving sheeps", 189.9f);
		Machines[] machines = new Machines[3];
		machines[0] = feederForPigs;
		machines[1] = milkingMachines;
		machines[2] = sheepShaver;
		System.out.println(feederForPigs.toString());
		System.out.println();
		System.out.println(milkingMachines.toString());
		System.out.println();
		System.out.println(sheepShaver.toString());
		System.out.println();
		Vehicles harvester = new Harvester(83945839l, "Same Deutz Fahr",
				"for shall grain", 19999.9f);
		Vehicles pickUp = new PickUp(3289482l, "Nissan Navara",
				"for everyday needs", 39999.9f);
		Vehicles tractorWithTrailer = new TractorWithTrailer(89274l,
				"John Deer", "for transport animals", 56999.9f);
		Vehicles[] vehicles = new Vehicles[3];
		vehicles[0] = harvester;
		vehicles[1] = pickUp;
		vehicles[2] = tractorWithTrailer;
		System.out.println(harvester.toString());
		System.out.println();
		System.out.println(pickUp.toString());
		System.out.println();
		System.out.println(tractorWithTrailer.toString());

		System.out.println();

		System.out.println("Food for animals: ");

		System.out.println();

		Corn corn = new Corn(123432434, "Corn", "From our own breeding", 100.5f);
		System.out.println("Data on corn: " + corn.toString());

		System.out.println();

		Silage silage = new Silage(1235468, "Silage", "From our own breeding",
				200.65f);
		System.out.println("Data on silage: " + silage.toString());

		System.out.println();

		Soybean soybean = new Soybean(6546546, "Soybean",
				"From our own breeding", 350.65f);
		System.out.println("Data on soybean: " + soybean.toString());

		System.out.println();

		System.out
				.println("Statistic about on amount of sold animals, her average weight, age and total profit: ");
		Statistic cattleStatistic = new Statistic(50, 115.8f, 1.3f, 5000);
		Statistic pigStatitstic = new Statistic(40, 98.5f, 0.9f, 2000);
		Statistic sheepStatistic = new Statistic(20, 29.8f, 0.8f, 1000);

		Statistic[] statistic = new Statistic[3];
		statistic[0] = cattleStatistic;
		statistic[1] = pigStatitstic;
		statistic[2] = sheepStatistic;

		FoodForAnimal[] foodForAnimal = new FoodForAnimal[3];
		foodForAnimal[0] = corn;
		foodForAnimal[1] = silage;
		foodForAnimal[2] = soybean;

		System.out.println();

		System.out.println("Outcome for machines: "
				+ Outcome.calculateOutcomeOfMachines(machines) + " kn.");

		System.out.println("Outcome for vehicles: "
				+ Outcome.calculateOutcomeOfVehicles(vehicles) + " kn.");

		System.out.println("Outcome of food for animals: "
				+ Outcome.calculateOutcomeOfFoodForAnimals(foodForAnimal)
				+ " kn.");

		System.out
				.println("Outcome sum: "
						+ Outcome.outcomeSum(
								farm.statistic.annualReport.Outcome
										.calculateOutcomeOfMachines(machines),
								farm.statistic.annualReport.Outcome
										.calculateOutcomeOfVehicles(vehicles),
								farm.statistic.annualReport.Outcome
										.calculateOutcomeOfFoodForAnimals(foodForAnimal))
						+ " kn.");

		System.out.println();

		System.out.println("Income of animals: " + Income.income(statistic)
				+ " kn.");

		System.out.println();

		System.out.println("Profit:");

		System.out
				.println("    Annual profit: "
						+ Profit.profit(
								Outcome.outcomeSum(
										Outcome.calculateOutcomeOfMachines(machines),
										Outcome.calculateOutcomeOfVehicles(vehicles),
										Outcome.calculateOutcomeOfFoodForAnimals(foodForAnimal)),
								Income.income(statistic)) + " kn.");

	}
}