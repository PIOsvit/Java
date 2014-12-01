package farm.utility.land;

import farm.utility.Utility;
import farm.utility.amortisation.CalcAmortisation;

/*
 * @author: Ivan Azenic
 * Version: 1.0
 */

public class Land extends Utility implements CalcAmortisation {

	private long id;
	private String name;
	private float gpsLocation;
	private float price;
	private double landSurface;
	private String cropPlanted;
	private String cadastralPlotNumber;

	public Land(long id, String name, float gpsLocation, float price,
			double landSurface, String cropPlanted, String cadastralPlotNumber) {

		this.id = id;
		this.name = name;
		this.gpsLocation = gpsLocation;
		this.price = price;
		this.cropPlanted = cropPlanted;
		this.landSurface = landSurface;
		this.cadastralPlotNumber = cadastralPlotNumber;

	}

	public double getLandSurface() {
		return landSurface;
	}

	public String getCropPlanted() {
		return cropPlanted;
	}

	public String getCadastralPlotNumber() {
		return cadastralPlotNumber;
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

		return Amortisation.LAND.getAmortisationValue() * getPrice() / 100;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Name: ");
		builder.append(name);
		builder.append(System.getProperty("line.separator"));
		builder.append("Id: ");
		builder.append(id);
		builder.append(System.getProperty("line.separator"));
		builder.append("Gps location: ");
		builder.append(gpsLocation);
		builder.append(System.getProperty("line.separator"));
		builder.append("Price: ");
		builder.append(price);
		builder.append(System.getProperty("line.separator"));
		builder.append("Land surface: ");
		builder.append(landSurface);
		builder.append(System.getProperty("line.separator"));
		builder.append("Crop planted: ");
		builder.append(cropPlanted);
		builder.append(System.getProperty("line.separator"));
		builder.append("Cadastral plot number: ");
		builder.append(cadastralPlotNumber);
		builder.append(System.getProperty("line.separator"));
		builder.append("Amortisation cost: ");
		builder.append(getAmortisationCost());

		return builder.toString();
	}

}
