/**
 * @author Josip Perak
 */
package farm.personnel.thePersonnel;

import farm.personnel.enumPersonnel.Education;

public class FarmWorker extends Personnel {

	public static final int NUMBER_VACATION_DAYS = 21;
	private int operatingHoursPerMonth;
	private float salary;

	public FarmWorker(int operatingHoursPerDay, int operatingHoursPerMonth, float salary, boolean working) {
		super(operatingHoursPerDay, working);
		this.operatingHoursPerMonth = operatingHoursPerMonth;
		this.salary = salary;
	}


	public static void feedAnimal() {
		System.out.println("Animal is fed!");
	}

	public static void waterAnimal() {
		System.out.println("Animal is watered");
	}

	public static void cleanStall() {
		System.out.println("Stall is cleaned!");
	}

	public int getOperatingHoursPerMonth() {
		return operatingHoursPerMonth;
	}

	public float getSalary() {
		return salary;
	}

	@Override
	public Education getEducation() {
		return Education.AGRICULTURAL_SCHOOL;
	}

	@Override
	public boolean isQuitJob() {
		return false;
	}

	public String toString() {
		return "FarmWorker have this specification: His education is "
				+ getEducation() + ", operating hours per day is "
				+ getOperatingHoursPerDay()
				+ ", operating hours per month is "
				+ getOperatingHoursPerMonth() + ", salary amounts "
				+ getSalary() + "€" + ", number of vacation days is "
				+ FarmWorker.NUMBER_VACATION_DAYS + "."
				+ " Does he working in first shift today? "
				+ isWorking() + ".";
	}
}
