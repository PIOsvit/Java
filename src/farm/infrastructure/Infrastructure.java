/**
 * @author Ivan Greguric
 */
package farm.infrastructure;

public class Infrastructure {

	private float size;
	private int capacity;
	private Resources mResources;
	private boolean maintanance;
	private boolean isClime;

	public Infrastructure(float size, int capacity, Resources resources,
			boolean maintanance, boolean isClime) {
		this.size = size;
		this.capacity = capacity;
		this.mResources = resources;
		this.maintanance = maintanance;
		this.isClime = isClime;
	}

	public float getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	public Resources getmResources() {
		return mResources;
	}

	public boolean isMaintanance() {
		return maintanance;
	}

	public boolean isClime() {
		return isClime;
	}

}
