package farm.utility.objects;

import farm.utility.Utility;
import farm.utility.amortisation.CalcAmortisation;

/*
 * @author: Ivan Azenic
 * Version: 1.0
 */
public class Stable extends Utility implements CalcAmortisation {

	private long id;
	private String name;
	private float gpsLocation;
	private float price;
	private double surface;
	private double currFarmCapacity;
	private double maxFarmCapacity;
	private double farmUsage;

	public Stable(long id, String name, float gpsLocation, float price,
			double surface, double currFarmCapacity, double maxFarmCapacity) {

		this.id = id;
		this.name = name;
		this.gpsLocation = gpsLocation;
		this.price = price;
		this.surface = surface;
		this.currFarmCapacity = currFarmCapacity;
		this.maxFarmCapacity = maxFarmCapacity;
		farmUsage = currFarmCapacity / maxFarmCapacity * 100;
	}

	public double getSurface() {
		return surface;
	}

	public double getCurrFarmCapacity() {
		return currFarmCapacity;
	}

	public double getMaxFarmCapacity() {
		return maxFarmCapacity;
	}

	public double getFarmUsage() {
		return farmUsage;
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
		builder.append("Current Farm capacity: ");
		builder.append(currFarmCapacity);
		builder.append(System.getProperty("line.separator"));
		builder.append("Maximum Farm capacity: ");
		builder.append(maxFarmCapacity);
		builder.append(System.getProperty("line.separator"));
		builder.append("Farm usage: ");
		builder.append(farmUsage);
		builder.append(System.getProperty("line.separator"));
		builder.append("Amortisation cost: ");
		builder.append(getAmortisationCost());
		return builder.toString();
	}

}
