/**
 * @author Ivan Greguric
 */
package farm.infrastructure;

public class Stall extends Infrastructure {

	private int numberOfMilkingPlaces;

	public Stall(float size, int capacity, Resources resources,
			boolean maintanance, boolean isClime, int numberOfMilkingPlaces) {
		super(size, capacity, resources, maintanance, isClime);
		this.numberOfMilkingPlaces = numberOfMilkingPlaces;
	}

	public int getNumberOfMilkingPlaces() {
		return numberOfMilkingPlaces;
	}

}
