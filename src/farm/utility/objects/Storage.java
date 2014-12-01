package farm.utility.objects;

import farm.utility.Utility;
import farm.utility.amortisation.CalcAmortisation;

/*
 * @author: Ivan Azenic
 * Version: 1.0
 */
public class Storage extends Utility implements CalcAmortisation {

	private long id;
	private String name;
	private float gpsLocation;
	private float price;
	private double currStorageCapacity;
	private double maxStorageCapacity;
	private double storageUsage;

	public Storage(long id, String name, float gpsLocation, float price,
			double currStorageCapacity, double maxStorageCapacity) {

		this.id = id;
		this.name = name;
		this.gpsLocation = gpsLocation;
		this.price = price;
		this.currStorageCapacity = currStorageCapacity;
		this.maxStorageCapacity = maxStorageCapacity;
		storageUsage = currStorageCapacity / maxStorageCapacity * 100;
	}

	public double getCurrStorageCapacity() {
		return currStorageCapacity;
	}

	public double getMaxStorageCapacity() {
		return maxStorageCapacity;
	}

	public double getStorageUsage() {
		return storageUsage;
	}

	@Override
	public long getId() {

		return id;
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public float getGpsLocation() {

		return gpsLocation;
	}

	@Override
	public float getPrice() {

		return price;
	}

	@Override
	public float getAmortisationCost() {

		return Amortisation.BUILDINGS.getAmortisationValue() * getPrice() / 100;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Id: ");
		builder.append(id);
		builder.append(System.getProperty("line.separator"));
		builder.append("Name: ");
		builder.append(name);
		builder.append(System.getProperty("line.separator"));
		builder.append("Gps location: ");
		builder.append(gpsLocation);
		builder.append(System.getProperty("line.separator"));
		builder.append("Price: ");
		builder.append(price);
		builder.append(System.getProperty("line.separator"));
		builder.append("Current storage capacity: ");
		builder.append(currStorageCapacity);
		builder.append(System.getProperty("line.separator"));
		builder.append("Maximum storage capacity: ");
		builder.append(maxStorageCapacity);
		builder.append(System.getProperty("line.separator"));
		builder.append("Storage usage: ");
		builder.append(storageUsage);
		builder.append(System.getProperty("line.separator"));
		builder.append("Amortisation cost: ");
		builder.append(getAmortisationCost());
		return builder.toString();
	}

}

