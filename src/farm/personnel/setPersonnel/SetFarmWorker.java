/**
 * @author Josip Perak
 */
package farm.personnel.setPersonnel;

import farm.personnel.thePersonnel.FarmWorker;

public class SetFarmWorker {

	public static FarmWorker setFarmworker(int operatingHoursPerMonth,
			int operatingHoursPerDay, float salary,
			int NUMBER_OF_VACATION_DAYS, boolean working) {

		FarmWorker farmWorker = new FarmWorker(operatingHoursPerDay,
				operatingHoursPerMonth, salary, working);
		return farmWorker;
	}
}
