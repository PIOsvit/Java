package farm.equipment.machines;

import farm.equipment.Equipment;

public class Machines extends Equipment {

	public Machines(long ID, String manufacturer, String usage, float price) {
		this.ID = ID;
		this.manufacturer = manufacturer;
		this.usage = usage;
		this.price = price;
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

}
