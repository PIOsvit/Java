package farm.equipment.vehicles;

public class PickUp extends Vehicles {
	public PickUp(long ID, String manufacturer, String usage, float price) {
		super(ID, manufacturer, usage, price);
		// TODO Auto-generated constructor stub
	}

	public long getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	public String getManufacturer() {
		// TODO Auto-generated method stub
		return manufacturer;
	}

	public String getUsage() {
		// TODO Auto-generated method stub
		return usage;
	}

	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(System.getProperty("line.separator"));
		buffer.append("PickUp ID = ");
		buffer.append("Harvester: ID = ");
		buffer.append(getID());
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Manufacturer = ");
		buffer.append(getManufacturer());
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Usage = ");
		buffer.append(getUsage());
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Price = ");
		buffer.append(getPrice());
		return buffer.toString();
	}

}
