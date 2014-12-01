/**
 * @author Ivan Greguric
 */
package farm.infrastructure;

public class Resources {

	private float water;
	private float electricity;
	private float fuel;

	public Resources(float water, float electricity, float fuel) {
		this.water = water;
		this.electricity = electricity;
		this.fuel = fuel;
	}

	public float getWater() {
		return water;
	}

	public float getElectricity() {
		return electricity;
	}

	public float getFuel() {
		return fuel;
	}

}
