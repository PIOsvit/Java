/**
 * @author Josip Perak
 */
package farm.animal.theAnimal;

import farm.animal.animalVariables.AverageFoodConsumption;
import farm.animal.animalVariables.Condition;
import farm.animal.animalVariables.Productivity;
import farm.animal.animalVariables.Reproduction;

public class Cow extends Animal {

	private boolean isMilked;

	public Cow(int identNo, AverageFoodConsumption averageFoodConsumption,
			Productivity productivity, Condition condition,
			Reproduction reproduction, boolean isMilked) {
		super(identNo, averageFoodConsumption, productivity, condition,
				reproduction);
		this.isMilked = isMilked;
	}

	public boolean isMilked() {
		return isMilked;
	}

	public String toString() {
		return "Cow No. " + getIdentNo() + getmAverageFoodConsumption()
				+ getmProductivity() + getmCondition() + getmReproduction()
				+ ", is milked " + isMilked;
	}
}