/* 
 * @author: Andrej Naðvegi
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.buildings.dairyMilkingFacility;

public final class DairyMilkingFacility {

	private int cadastralPlot;
	private float surface;
	private String dimensions;
	private int capacity;

	public DairyMilkingFacility(int cadastralPlot, float surface,
			String dimensions, int capacity) {
		this.cadastralPlot = cadastralPlot;
		this.surface = surface;
		this.dimensions = dimensions;
		this.capacity = capacity;
	}

	public int getCadastralPlot() {
		return cadastralPlot;
	}

	public float getSurface() {
		return surface;
	}

	public String getDimensions() {
		return dimensions;
	}

	public int getCapacity() {
		return capacity;
	}
}
