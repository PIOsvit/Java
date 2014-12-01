package farm.utility.amortisation;

/*
 * @author: Ivan Azenic
 * Version: 1.0
 */
public interface CalcAmortisation {

	public enum Amortisation {
		BUILDINGS(5), MACHINERY(25), LAND(10);

		private float amortisationValue;

		Amortisation(float amortisationValue) {
			this.amortisationValue = amortisationValue;
		}

		public float getAmortisationValue() {
			return amortisationValue;
		}

	}

	public float getAmortisationCost();

}
