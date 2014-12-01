/* @author: Sara Puljiæ
 * @version: 1.0
 * @date: 23.10.2014.
 */

package farm.foodForAnimal;

public final class Silage extends FoodForAnimal {

	public Silage(long ID, String type, String manufacturer, float price) {
		super(ID, type, manufacturer, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return super.ID;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.type;
	}

	@Override
	public String getManufacturer() {
		// TODO Auto-generated method stub
		return super.manufacturer;
	}

	@Override
	public float getPricePerKg() {
		// TODO Auto-generated method stub
		return super.price;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Corn ID = ");
		buffer.append(ID);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Type = ");
		buffer.append(type);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Manufacturer = ");
		buffer.append(manufacturer);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Price = ");
		buffer.append(price);
		buffer.append(" kn.");
		return buffer.toString();
	}

}
