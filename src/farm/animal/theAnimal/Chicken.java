/**
 * @author Josip Perak
 */
package farm.animal.theAnimal;

import farm.animal.animalVariables.AverageFoodConsumption;
import farm.animal.animalVariables.Condition;
import farm.animal.animalVariables.Productivity;
import farm.animal.animalVariables.Reproduction;

public class Chicken extends Animal {

	public Chicken(int identNo, AverageFoodConsumption averageFoodConsumption,
			Productivity productivity, Condition condition,
			Reproduction reproduction) {
		super(identNo, averageFoodConsumption, productivity, condition, null);
	}

	public String toString() {
		return "Chicken No. " + getIdentNo() + getmAverageFoodConsumption()
				+ getmProductivity() + getmCondition();
	}

}
