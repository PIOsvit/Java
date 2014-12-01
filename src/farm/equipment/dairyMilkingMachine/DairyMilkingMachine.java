/* 
 * @author: Zerina Salitrežiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.equipment.dairyMilkingMachine;

public final class DairyMilkingMachine {

	private String manufacturer;
	private String countryOfOrigin;
	private String type;
	private int capacity;

	public DairyMilkingMachine(String manufacturer, String countryOfOrigin,
			String type, int capacity) {
		this.manufacturer = manufacturer;
		this.countryOfOrigin = countryOfOrigin;
		this.type = type;
		this.capacity = capacity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public String getType() {
		return type;
	}

	public int getCapacity() {
		return capacity;
	}

}
