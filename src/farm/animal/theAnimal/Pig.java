/**
 * @author Josip Perak
 */
package farm.animal.theAnimal;

import farm.animal.animalVariables.AverageFoodConsumption;
import farm.animal.animalVariables.Condition;
import farm.animal.animalVariables.Productivity;
import farm.animal.animalVariables.Reproduction;

public class Pig extends Animal {

	private byte fatPercentage;

	public Pig(int identNo, AverageFoodConsumption averageFoodConsumption,
			Productivity productivity, Condition condition,
			Reproduction reproduction, byte fatPercentage) {
		super(identNo, averageFoodConsumption, productivity, condition,
				reproduction);
		this.fatPercentage = fatPercentage;
	}

	public byte getFatPercentage() {
		return fatPercentage;
	}

	public String toString() {
		return "Pig No. " + getIdentNo() + getmAverageFoodConsumption()
				+ getmProductivity() + getmCondition() + getmReproduction()
				+ ", fatPercentage " + fatPercentage + " %";
	}

}
