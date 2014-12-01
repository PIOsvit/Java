/**
 * @author Josip Perak
 */
package farm.personnel.setPersonnel;

import farm.personnel.thePersonnel.Veterinarian;

public class SetVeterinarian {

	public static Veterinarian setVeterinarian(int operatingHoursPerDay,
			int operatingHoursPerMonth, float salary, int numberOfUsedVaccines,
			int numberOfCuredAnimalsPerYear, boolean working) {

		Veterinarian veterinarian = new Veterinarian(operatingHoursPerMonth,
				operatingHoursPerDay, salary, numberOfUsedVaccines,
				numberOfCuredAnimalsPerYear, working);
		return veterinarian;
	}
}