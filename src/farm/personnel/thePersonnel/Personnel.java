/**
 * @author Josip Perak
 */
package farm.personnel.thePersonnel;

import farm.personnel.enumPersonnel.Education;

public abstract class Personnel {

	private int operatingHoursPerDay;
	private boolean working;

	public Personnel(int operatingHoursPerDay, boolean working) {
		this.operatingHoursPerDay = operatingHoursPerDay;
		this.working = working;
	}

	public int getOperatingHoursPerDay() {
		return operatingHoursPerDay;
	}

	public boolean isWorking() {
		return working;
	}

	public abstract Education getEducation();

	public abstract boolean isQuitJob();
	
	public final int getYearsOfOperation() {
		int yearOfOperation = 1 + (int) (Math.random() * 40);
		return yearOfOperation;
	}


}