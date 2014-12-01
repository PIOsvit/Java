/**
 * @author Ivan Greguric
 */
package farm.infrastructure;

public class Pigsty extends Infrastructure {

	private int numberOfCotes;

	public Pigsty(float size, int capacity, Resources resources,
			boolean maintanance, boolean isClime, int numberOfCotes) {
		super(size, capacity, resources, maintanance, isClime);
	}

	public int getNumberOfCotes() {
		return numberOfCotes;
	}

}
