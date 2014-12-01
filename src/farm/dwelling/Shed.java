/* @author: Filip Kovaèeviæ
 * @version: 1.0
 * @date: 23.10.2014.
 */

package farm.dwelling;

public final class Shed extends Dwelling {

	public Shed(long id, int surface, int capacity, int numberOfDwellings) {
		super(id, surface, capacity, numberOfDwellings);
		// TODO Auto-generated constructor stub
	}

	public long getID() {
		// TODO Auto-generated method stub
		return super.id;
	}

	public int getSurface() {
		// TODO Auto-generated method stub
		return super.surface;
	}

	public int getCapacity() {
		// TODO Auto-generated method stub
		return super.capacity;
	}

	public int getNumberOfDwellings() {
		// TODO Auto-generated method stub
		return super.numberOfDwellings;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Barn ID = ");
		buffer.append(id);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Surface = ");
		buffer.append(surface);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Capacity = ");
		buffer.append(capacity);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Number of dwellings = ");
		buffer.append(numberOfDwellings);
		buffer.append(System.getProperty("line.separator"));
		return buffer.toString();
	}

}
