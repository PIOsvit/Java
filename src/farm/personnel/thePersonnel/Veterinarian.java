/**
 * @author Josip Perak
 */
package farm.personnel.thePersonnel;

import farm.personnel.enumPersonnel.Education;

public class Veterinarian extends Personnel {

	private int operatingHoursPerMonth;
	private float salary;
	private int numberOfUsedVaccines;
	private int numberOfCuredAnimalsPerYear;

	public Veterinarian(int operatingHoursPerDay, int operatingHoursPerMonth,
			float salary, int numberOfUsedVaccines,
			int numberOfCuredAnimalsPerYear, boolean working) {
		super(operatingHoursPerDay, working);
		this.operatingHoursPerMonth = operatingHoursPerMonth;
		this.salary = salary;
		this.numberOfUsedVaccines = numberOfUsedVaccines;
		this.numberOfCuredAnimalsPerYear = numberOfCuredAnimalsPerYear;
	}

	public static void cureAnimal() {
		System.out.println("Animal is cured!");
	}

	public static void bearAnimal() {
		System.out.println("Anmal is beared!");
	}

	public static void vaccinateAnimal() {
		System.out.println("Animal is vaccinated!");
	}

	public int getOperatingHoursPerMonth() {
		return operatingHoursPerMonth;
	}

	public float getSalary() {
		return salary;
	}

	public int getNumberOfUsedVaccines() {
		return numberOfUsedVaccines;
	}

	public int getNumberOfCuredAnimalsPerYear() {
		return numberOfCuredAnimalsPerYear;
	}

	@Override
	public Education getEducation() {
		return Education.VETERINARY_SCHOOL;
	}

	@Override
	public boolean isQuitJob() {
		return false;
	}

	public String toString() {
		return "Veterinarian have this specification: His education is "
				+ getEducation() + ", number of used vaccines per month is "
				+ getNumberOfUsedVaccines()
				+ ", number of cured animals per year is "
				+ getNumberOfCuredAnimalsPerYear()
				+ ", operating hours per day is " + getOperatingHoursPerDay()
				+ ", operating hours per month is "
				+ getOperatingHoursPerMonth() + ", salary amounts "
				+ getSalary() + "€"
				+ ". Does he working in first shift today? " + isWorking()
				+ ".";
	}

}
