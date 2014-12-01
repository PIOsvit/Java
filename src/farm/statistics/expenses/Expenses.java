/* 
 * @author: Zerina Salitrežiæ
 * @date: 28.10.2014.
 * @version: 1.0
 */

package farm.statistics.expenses;

public final class Expenses {

	public static float averageExpenseOfElectricityPerMonth(
			int numberOfSpentKwhPerDay) {
		float averageExpenseOfElectricityPerMonth = 0;
		float priceOfOneKwh = 1.5f;
		averageExpenseOfElectricityPerMonth = priceOfOneKwh
				* numberOfSpentKwhPerDay * 30;
		return averageExpenseOfElectricityPerMonth;
	}

	public static float averageExpenseOfWaterPerMonth(
			int spentLitresOfWaterPerDay) {
		float averageExpenseOfWaterPerMonth = 0;
		float priceOfWaterPerLiter = 0.032f;
		averageExpenseOfWaterPerMonth = priceOfWaterPerLiter
				* spentLitresOfWaterPerDay * 30;
		return averageExpenseOfWaterPerMonth;
	}

	public static float averageExpenseOfFoodForCowsPerMonth(int numberOfCows,
			int spentKilosOfHayPerCowPerDay,
			int spentKilosOfSilagePerCowPerDay,
			int spentKilosOfGrainPerCowPerDay) {
		float averageExpenseOfFoodForCowsPerDay = 0;
		float priceOfHayPerKg = 0.77f;
		float priceOfSilagePerKg = 0.26f;
		float priceOfGrainPerKg = 2.76f;
		averageExpenseOfFoodForCowsPerDay = ((priceOfHayPerKg * spentKilosOfHayPerCowPerDay)
				+ (priceOfSilagePerKg * spentKilosOfSilagePerCowPerDay) + (priceOfGrainPerKg * spentKilosOfGrainPerCowPerDay))
				* numberOfCows;
		float averageExpenseOfFoodForCowsPerMonth = averageExpenseOfFoodForCowsPerDay * 30;
		return averageExpenseOfFoodForCowsPerMonth;
	}

	public static float averageExpenseOfFoodForBullsPerMonth(int numberOfBulls,
			int spentKilosOfHayPerBullPerDay,
			int spentKilosOfSilagePerBullPerDay,
			int spentKilosOfGrainPerBullPerDay) {
		float averageExpenseOfFoodForBullsPerDay = 0;
		float priceOfHayPerKg = 0.77f;
		float priceOfSilagePerKg = 0.26f;
		float priceOfGrainPerKg = 2.76f;
		averageExpenseOfFoodForBullsPerDay = ((priceOfHayPerKg * spentKilosOfHayPerBullPerDay)
				+ (priceOfSilagePerKg * spentKilosOfSilagePerBullPerDay) + (priceOfGrainPerKg * spentKilosOfGrainPerBullPerDay))
				* numberOfBulls;
		float averageExpenseOfFoodForBullsPerMonth = averageExpenseOfFoodForBullsPerDay * 30;
		return averageExpenseOfFoodForBullsPerMonth;
	}

	public static float averageExpenseOfFoodForCalfsPerMonth(int numberOfCalfs,
			int spentKilosOfHayPerCalfPerDay,
			int spentKilosOfSilagePerCalfPerDay,
			int spentKilosOfGrainPerCalfPerDay) {
		float averageExpenseOfFoodForCalfsPerDay = 0;
		float priceOfHayPerKg = 0.77f;
		float priceOfSilagePerKg = 0.26f;
		float priceOfGrainPerKg = 2.76f;
		averageExpenseOfFoodForCalfsPerDay = ((priceOfHayPerKg * spentKilosOfHayPerCalfPerDay)
				+ (priceOfSilagePerKg * spentKilosOfSilagePerCalfPerDay) + (priceOfGrainPerKg * spentKilosOfGrainPerCalfPerDay))
				* numberOfCalfs;
		float averageExpenseOfFoodForCalfsPerMonth = averageExpenseOfFoodForCalfsPerDay * 30;
		return averageExpenseOfFoodForCalfsPerMonth;
	}

	public static float totalAverageExpenseOfFoodForCattlePerMonth(
			float averageExpenseOfFoodForCowsPerMonth,
			float averageExpenseOfFoodForBullsPerMonth,
			float averageExpenseOfFoodForCalfsPerMonth) {
		float totalAverageExpenseOfFoodForCattlePerMonth = averageExpenseOfFoodForCowsPerMonth
				+ averageExpenseOfFoodForBullsPerMonth
				+ averageExpenseOfFoodForCalfsPerMonth;
		return totalAverageExpenseOfFoodForCattlePerMonth;
	}

	public static float expenseForSalariesOfStaffPerMonth(
			float salaryOfManager, float salaryOfVeterinarian,
			float salaryOfWorker) {
		float expenseForSalariesOfStaffPerMonth = salaryOfManager
				+ salaryOfVeterinarian + salaryOfWorker;
		return expenseForSalariesOfStaffPerMonth;
	}

	public static float totalExpensePerYear(
			float averageExpenseOfElectricityPerMonth,
			float averageExpenseOfWaterPerMonth,
			float totalAverageExpenseOfFoodForCattlePerMonth,
			float expenseForSalariesOfStaffPerMonth) {
		float totalExpensePerYear = (averageExpenseOfElectricityPerMonth
				+ averageExpenseOfWaterPerMonth
				+ totalAverageExpenseOfFoodForCattlePerMonth + expenseForSalariesOfStaffPerMonth) * 12;
		return totalExpensePerYear;

	}
}