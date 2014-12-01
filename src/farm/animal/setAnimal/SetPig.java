/**
 * @author Ivan Greguric
 */
package farm.animal.setAnimal;

import farm.animal.animalVariables.AverageFoodConsumption;
import farm.animal.animalVariables.Condition;
import farm.animal.animalVariables.Productivity;
import farm.animal.animalVariables.Reproduction;
import farm.animal.theAnimal.Pig;

public abstract class SetPig {

	public static Pig setPig(int identNo,
			AverageFoodConsumption averageFoodConsumption,
			Productivity productivity, Condition condition,
			Reproduction reproduction, byte fatPercentage) {

		Pig pig = new Pig(identNo, averageFoodConsumption, productivity,
				condition, reproduction, fatPercentage);
		return pig;
	}

}