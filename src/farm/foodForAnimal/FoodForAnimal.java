/* @author: Sara Puljiæ
 * @version: 1.0
 * @date: 23.10.2014.
 */

package farm.foodForAnimal;

public abstract class FoodForAnimal {

	protected long ID;
	protected String type;
	protected String manufacturer;
	protected float price;

	public FoodForAnimal(long ID, String type, String manufacturer, float price) {
		this.ID = ID;
		this.type = type;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	public abstract long getID();

	public abstract String getType();

	public abstract String getManufacturer();

	public abstract float getPricePerKg();

}
