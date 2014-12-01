package farm.utility.machinery;

import farm.utility.Utility;
import farm.utility.amortisation.CalcAmortisation;

/*
 * @author: Ivan Azenic
 * Version: 1.0
 */

public class Attachment extends Utility implements CalcAmortisation {

	private long id;
	private String name;
	private float gpsLocation;
	private float price;
	private byte age;
	private String use;

	public Attachment(long id, String name, float gpsLocation, byte age,
			String use, float price) {

		this.id = id;
		this.name = name;
		this.gpsLocation = gpsLocation;
		this.price = price;
		this.age = age;
		this.use = use;

	}

	public byte getAge() {
		return age;
	}

	public String getUSe() {
		return use;
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

		return Amortisation.MACHINERY.getAmortisationValue() * getPrice() / 100;
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
		builder.append("Age: ");
		builder.append(age);
		builder.append(System.getProperty("line.separator"));
		builder.append("Use: ");
		builder.append(use);
		builder.append(System.getProperty("line.separator"));
		builder.append("Amortisation cost: ");
		builder.append(getAmortisationCost());
		return builder.toString();
	}

}

