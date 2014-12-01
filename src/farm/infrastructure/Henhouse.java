/**
 * @author Ivan Greguric
 */
package farm.infrastructure;

public class Henhouse extends Infrastructure {

	private int numberOfCages;

	public Henhouse(float size, int capacity, Resources resources,
			boolean maintanance, boolean isClime, int numberOfCages) {
		super(size, capacity, resources, maintanance, isClime);
	}

	public int getNumberOfCages() {
		return numberOfCages;
	}

}
