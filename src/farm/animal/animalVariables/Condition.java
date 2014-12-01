/*
 * @ Josip Perak
 */

package farm.animal.animalVariables;

public class Condition {

	private int age;
	private float mass;
	private Genre genre;
	private float healthCostPerYear;
	private boolean injury;
	private boolean disease;

	public Condition(int age, float mass, Genre genre, float healthCostPerYear,
			boolean injury, boolean disease) {
		this.age = age;
		this.mass = mass;
		this.genre = genre;
		this.healthCostPerYear = healthCostPerYear;
		this.injury = injury;
		this.disease = disease;
	}

	public int getAge() {
		return age;
	}

	public float getMass() {
		return mass;
	}

	public Genre getGenre() {
		return genre;
	}

	public float getHealthCostPerYear() {
		return healthCostPerYear;
	}

	public boolean isInjury() {
		return injury;
	}

	public boolean isDisease() {
		return disease;
	}

	public String toString() {
		String year = "year";
		if (age == 1) {
			year = "year";
		} else {
			year = "years";
		}
		return ", age " + age + " " + year + ", mass " + mass + " kg, genre "
				+ genre + ", healthCostPerYear " + healthCostPerYear
				+ " € , injury " + injury + ", disease " + disease;
	}

}
