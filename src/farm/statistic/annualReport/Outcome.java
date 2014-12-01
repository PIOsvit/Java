/* @author: Matija Goršek, Filip Kovaèeviæ, Sara Puljiæ
 * @version: 1.0
 * @date: 23.10.2014.
 */

package farm.statistic.annualReport;

import farm.equipment.machines.Machines;
import farm.equipment.vehicles.Vehicles;
import farm.foodForAnimal.FoodForAnimal;

public class Outcome {

	public static float calculateOutcomeOfMachines(Machines array[]) {
		float sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i].getPrice();
		}
		return sum;

	}

	public static float calculateOutcomeOfVehicles(Vehicles array[]) {
		float sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i].getPrice();
		}
		return sum;

	}

	public static float calculateOutcomeOfFoodForAnimals(FoodForAnimal array[]) {

		float sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i].getPricePerKg();
		}
		return sum;
	}

	public static float outcomeSum(float calculateOutcomeOfMachines,
			float calculateOutcomeOfVehicles,
			float calculateOutcomeOfFoodForAnimals) {
		float sum = calculateOutcomeOfFoodForAnimals
				+ calculateOutcomeOfMachines + calculateOutcomeOfVehicles;
		return sum;

	}

}
