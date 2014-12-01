/**
 * @author Ivan Greguric
 */
package farm.animal.setAnimal;

import farm.animal.animalVariables.AverageFoodConsumption;
import farm.animal.animalVariables.Condition;
import farm.animal.animalVariables.Productivity;
import farm.animal.animalVariables.Reproduction;
import farm.animal.theAnimal.Cow;

public abstract class SetCow {

	public static Cow setCow(int identNo,
			AverageFoodConsumption averageFoodConsumption,
			Productivity productivity, Condition condition,
			Reproduction reproduction, boolean isMilked) {

		Cow cow = new Cow(identNo, averageFoodConsumption, productivity,
				condition, reproduction, isMilked);
		return cow;
	}

}