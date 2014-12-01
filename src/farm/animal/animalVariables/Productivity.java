/**
 * @author Ivan Greguric
 */
package farm.animal.animalVariables;

public class Productivity {

	private float dailyBenefit;
	private float annualBenefit;
	private Benefit benefit;

	public Productivity(float dailyBenefit, float annualBenefit, Benefit benefit) {
		this.dailyBenefit = dailyBenefit;
		this.annualBenefit = annualBenefit;
		this.benefit = benefit;
	}

	public float getDailyBenefit() {
		return dailyBenefit;
	}

	public float getAnnualBenefit() {
		return annualBenefit;
	}

	public Benefit getBenefit() {
		return benefit;
	}

	public String toString() {

		String unit = "lit";

		if (benefit == Benefit.EGG) {
			unit = "pic";
		}
		if (benefit == Benefit.MEAT) {
			unit = "kg";
		}
		return ", benefit " + benefit + " " + dailyBenefit + " " + unit
				+ ", annual " + annualBenefit + " " + unit;
	}

}
