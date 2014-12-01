/**
 * @author dkopic
 */
package farm.animal.theAnimal;

import farm.animal.animalVariables.AverageFoodConsumption;
import farm.animal.animalVariables.Condition;
import farm.animal.animalVariables.Productivity;
import farm.animal.animalVariables.Reproduction;

public class Animal {

	private int identNo;
	private AverageFoodConsumption mAverageFoodConsumption;
	private Productivity mProductivity;
	private Condition mCondition;
	private Reproduction mReproduction;

	protected Animal(int identNo,
			AverageFoodConsumption averageFoodConsumption,
			Productivity productivity, Condition condition,
			Reproduction reproduction) {
		this.identNo = identNo;
		this.mAverageFoodConsumption = averageFoodConsumption;
		this.mProductivity = productivity;
		this.mCondition = condition;
		this.mReproduction = reproduction;

	}

	public int getIdentNo() {
		return identNo;
	}

	public AverageFoodConsumption getmAverageFoodConsumption() {
		return mAverageFoodConsumption;
	}

	public Productivity getmProductivity() {
		return mProductivity;
	}

	public Condition getmCondition() {
		return mCondition;
	}

	public Reproduction getmReproduction() {
		return mReproduction;
	}

}
