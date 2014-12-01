/**
 * @author Ivan Greguric
 */
package farm.animal.setAnimal;

import farm.animal.animalVariables.AverageFoodConsumption;
import farm.animal.animalVariables.Condition;
import farm.animal.animalVariables.Productivity;
import farm.animal.animalVariables.Reproduction;
import farm.animal.theAnimal.Chicken;

public abstract class SetChicken {

	public static Chicken setChicken(int identNo,
			AverageFoodConsumption averageFoodConsumption,
			Productivity productivity, Condition condition,
			Reproduction reproduction) {

		Chicken chicken = new Chicken(identNo, averageFoodConsumption,
				productivity, condition, reproduction);
		return chicken;
	}

}