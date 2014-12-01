/* 
 * @author: Andrej Naðvegi
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.buildings.foodStore;

public final class Silos extends FoodStore {

	private String type;
	private int cadastralPlot;
	private float surface;
	private String dimensions;
	private int capacity;
	private String typeOfGrain;

	public Silos(String type, int cadastralPlot, float surface,
			String dimensions, int capacity, String typeOfGrain) {
		this.type = type;
		this.cadastralPlot = cadastralPlot;
		this.surface = surface;
		this.dimensions = dimensions;
		this.capacity = capacity;
		this.typeOfGrain = typeOfGrain;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public int getCadastralPlot() {
		return cadastralPlot;
	}

	@Override
	public float getSurface() {
		return surface;
	}

	@Override
	public String getDimensions() {
		return dimensions;
	}

	@Override
	public int getCapacity() {
		return capacity;
	}

	public String getTypeOfGrain() {
		return typeOfGrain;
	}

}
