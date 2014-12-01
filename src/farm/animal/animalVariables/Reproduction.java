/**
 * @author Josip Perak
 */
package farm.animal.animalVariables;

public class Reproduction {

	private boolean haveOffspring;
	private int offspringPerYear;

	public Reproduction(boolean haveOffspring, int offspringPerYear) {
		this.haveOffspring = haveOffspring;
		this.offspringPerYear = offspringPerYear;
	}

	public boolean isHaveOffspring() {
		return haveOffspring;
	}

	public int getOffspringPerYear() {
		return offspringPerYear;
	}

	public String toString() {
		return ", young " + haveOffspring + ", young per year "
				+ offspringPerYear;
	}

}
