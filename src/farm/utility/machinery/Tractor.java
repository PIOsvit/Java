package farm.utility.machinery;

import farm.utility.Utility;
import farm.utility.amortisation.CalcAmortisation;

/*
 * @author: Ivan Azenic
 * Version: 1.0
 */

public class Tractor extends Utility implements CalcAmortisation {

	private long id;
	private String name;
	private float gpsLocation;
	private float price;
	private byte age;
	private String model;
	private int horsePower;

	public Tractor(long id, String name, float gpsLocation, float price,
			byte age, String model, int horsePower) {

		this.id = id;
		this.name = name;
		this.gpsLocation = gpsLocation;
		this.price = price;
		this.age = age;
		this.model = model;
		this.horsePower = horsePower;

	}

	public byte getAge() {
		return age;
	}

	public String getModel() {
		return model;
	}

	public int getHorsePower() {
		return horsePower;
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
		builder.append("Age: ");
		builder.append(age);
		builder.append(System.getProperty("line.separator"));
		builder.append("Model: ");
		builder.append(model);
		builder.append(System.getProperty("line.separator"));
		builder.append("Horse power: ");
		builder.append(horsePower);
		builder.append(System.getProperty("line.separator"));
		builder.append("Name: ");
		builder.append(name);
		builder.append(System.getProperty("line.separator"));
		builder.append("Gps location ");
		builder.append(gpsLocation);
		builder.append(System.getProperty("line.separator"));
		builder.append("Price: ");
		builder.append(price);
		builder.append(System.getProperty("line.separator"));
		builder.append("Amortisation value: ");
		builder.append(getAmortisationCost());
		return builder.toString();
	}

}

