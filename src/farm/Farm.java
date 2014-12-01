/* @author: Matija Goršek, Filip Kovaèeviæ, Sara Puljiæ
 * @version: 1.0
 * @date: 23.10.2014.
 */

package farm;

import java.util.Arrays;

import farm.animalsOnFarm.AnimalsOnFarm;
import farm.dwelling.Dwelling;
import farm.equipment.Equipment;
import farm.foodForAnimal.FoodForAnimal;
import farm.statistic.Statistic;

public class Farm {

	public AnimalsOnFarm[] mAnimalsOnFarm;
	public Dwelling[] mDwelling;
	public Equipment[] mEquipment;
	public FoodForAnimal[] mFoodForAnimal;
	public Statistic[] mStatistic;

	public Farm(AnimalsOnFarm[] animalsOnFarm, Dwelling[] dwelling,
			Equipment[] equipment, FoodForAnimal[] foodForAnimal,
			Statistic[] statistic) {
		mAnimalsOnFarm = animalsOnFarm;
		mDwelling = dwelling;
		mEquipment = equipment;
		mFoodForAnimal = foodForAnimal;
		mStatistic = statistic;

	}

	public AnimalsOnFarm[] getmAnimalsOnFarm() {
		return mAnimalsOnFarm;
	}

	public Dwelling[] getmDwelling() {
		return mDwelling;
	}

	public Equipment[] getmEquipment() {
		return mEquipment;
	}

	public FoodForAnimal[] getmFoodForAnimal() {
		return mFoodForAnimal;
	}

	public Statistic[] getmStatistic() {
		return mStatistic;
	}

	@Override
	public String toString() {
		return "Farm [mAnimalsOnFarm=" + Arrays.toString(mAnimalsOnFarm)
				+ ", mDwelling=" + Arrays.toString(mDwelling) + ", mEquipment="
				+ Arrays.toString(mEquipment) + ", mFoodForAnimal="
				+ Arrays.toString(mFoodForAnimal) + ", mStatistic="
				+ Arrays.toString(mStatistic) + "]";
	}

}