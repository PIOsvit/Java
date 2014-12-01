/* 
 * @author: Domagoj Samardžiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.buildings.barn;

public final class CalfsBarn extends Barn {

	private String type;
	private int cadastralPlot;
	private float surface;
	private String dimensions;
	private int capacity;
	private int numberOfCattle;

	public CalfsBarn(String type, int cadastralPlot, float surface,
			String dimensions, int capacity, int numberOfCattle) {
		this.type = type;
		this.cadastralPlot = cadastralPlot;
		this.surface = surface;
		this.dimensions = dimensions;
		this.capacity = capacity;
		this.numberOfCattle = numberOfCattle;
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

	@Override
	public int getNumberOfCattle() {
		return numberOfCattle;
	}

	@Override
	public float usedCapacityPercentage() {
		float usedCapacityPercentage = ((float) numberOfCattle / capacity) * 100;
		return usedCapacityPercentage;
	}
}