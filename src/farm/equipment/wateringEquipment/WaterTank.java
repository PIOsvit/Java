/* 
 * @author: Zerina Salitrežiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.equipment.wateringEquipment;

public final class WaterTank extends WateringEquipment {

	private String countryOfOrigin;
	private String material;
	private String color;
	private float volume;

	public WaterTank(String countryOfOrigin, String material, String color,
			float volume) {
		this.countryOfOrigin = countryOfOrigin;
		this.material = material;
		this.color = color;
		this.volume = volume;
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
	public float getVolume() {
		return volume;
	}

}
