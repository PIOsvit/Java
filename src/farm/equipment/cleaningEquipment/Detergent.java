/* 
 * @author: Domagoj Samardžiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.equipment.cleaningEquipment;

public final class Detergent extends CleaningEquipment {

	private String producer;
	private int packingInKg;
	private String name;
	private String purpose;

	public Detergent(String producer, int packingInKg, String name,
			String purpose) {
		this.producer = producer;
		this.packingInKg = packingInKg;
		this.name = name;
		this.purpose = purpose;
	}

	@Override
	public String getProducer() {
		return producer;
	}

	@Override
	public int getPackingInKg() {
		return packingInKg;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPurpose() {
		return purpose;
	}

}
