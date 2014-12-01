/* 
 * @author: Andrej Naðvegi
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.equipment.foodEquipment;

public final class UniversalBucketForFood extends FoodEquipment {

	private String countryOfOrigin;
	private String material;
	private String color;
	private float capacity;

	public UniversalBucketForFood(String countryOfOrigin, String material,
			String color, float capacity) {
		this.countryOfOrigin = countryOfOrigin;
		this.material = material;
		this.color = color;
		this.capacity = capacity;
	}

	@Override
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	@Override
	public String getMaterial() {
		return material;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public float getCapacity() {
		return capacity;
	}

}
