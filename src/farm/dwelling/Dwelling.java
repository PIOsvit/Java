/* @author: Filip Kovaèeviæ
 * @version: 1.0
 * @date: 23.10.2014.
 */

package farm.dwelling;

public abstract class Dwelling {

	protected long id;
	protected int surface;
	protected int capacity;
	protected int numberOfDwellings;

	public Dwelling(long id, int surface, int capacity, int numberOfDwellings) {
		this.id = id;
		this.surface = surface;
		this.capacity = capacity;
		this.numberOfDwellings = numberOfDwellings;
	}

	public abstract long getID();

	public abstract int getSurface();

	// mass for Silo
	public abstract int getCapacity();

	public abstract int getNumberOfDwellings();

}
