/* 
 * @author: Zerina Salitrežiæ
 * @date: 28.10.2014.
 * @version: 1.0
 */

package farm.statistics.incomes;

import farm.cattle.Cow;
import farm.soldCattle.SoldBulls;
import farm.soldCattle.SoldCalfs;
import farm.soldCattle.SoldCows;

public final class Incomes {

	public static float incomeOfSoldBulls(SoldBulls[] soldBulls) {
		float pricePerKg = 14.5f;
		float incomeOfSoldBulls = 0;
		for (int i = 0; i < soldBulls.length; i++) {
			incomeOfSoldBulls = incomeOfSoldBulls
					+ (soldBulls[i].getWeight() * pricePerKg);
		}
		return incomeOfSoldBulls;
	}

	public static float incomeOfSoldCalfs(SoldCalfs[] soldCalfs) {
		float pricePerKg = 22;
		float incomeOfSoldCalfs = 0;
		for (int i = 0; i < soldCalfs.length; i++) {
			incomeOfSoldCalfs = incomeOfSoldCalfs
					+ (soldCalfs[i].getWeight() * pricePerKg);
		}
		return incomeOfSoldCalfs;
	}

	public static float incomeOfSoldCows(SoldCows[] soldCows) {
		float pricePerKg = 10;
		float incomeOfSoldCows = 0;
		for (int i = 0; i < soldCows.length; i++) {
			incomeOfSoldCows = incomeOfSoldCows
					+ (soldCows[i].getWeight() * pricePerKg);
		}
		return incomeOfSoldCows;
	}

	public static float totalIncomeOfSoldCattle(float incomeOfSoldBulls,
			float incomeOfSoldCalfs, float incomeOfSoldCows) {
		float totalIncomeOfSoldCattle = incomeOfSoldBulls + incomeOfSoldCalfs
				+ incomeOfSoldCows;
		return totalIncomeOfSoldCattle;
	}

	public static float incomeOfMilkPerMonthInKn(Cow[] cows) {
		float totalMilkPerDay = 0;
		for (int i = 0; i < cows.length; i++) {
			totalMilkPerDay = totalMilkPerDay + cows[i].getMilkPerCowPerDay();
		}
		float totalMilkPerMonth = totalMilkPerDay * 30;
		float priceOfMilkPerLitar = 5.50f;
		float incomeOfMilkPerMonthInKn = priceOfMilkPerLitar
				* totalMilkPerMonth;
		return incomeOfMilkPerMonthInKn;
	}

	public static float totalIncomePerYear(float totalIncomeOfSoldCattle,
			float incomeOfMilkPerMonthInKn) {
		float totalIncomePerYear = totalIncomeOfSoldCattle
				+ (incomeOfMilkPerMonthInKn * 12);
		return totalIncomePerYear;
	}

}
