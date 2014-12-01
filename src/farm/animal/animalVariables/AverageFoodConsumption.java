/**
 * @author dkopic
 */
package farm.animal.animalVariables;

public class AverageFoodConsumption {

	private FoodType foodType;
	private float dailyFoodConsumption;
	private boolean isFullFed;

	public AverageFoodConsumption(FoodType foodType,
			float dailyFoodConsumption, boolean isFullFed) {
		this.foodType = foodType;
		this.dailyFoodConsumption = dailyFoodConsumption;
		this.isFullFed = isFullFed;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public float getDailyFoodConsumption() {
		return dailyFoodConsumption;
	}

	public boolean isFullFed() {
		return isFullFed;
	}

	public String toString() {
		return ", food " + foodType + ", ate today " + dailyFoodConsumption
				+ " kg" + ", fed " + isFullFed;
	}

}
