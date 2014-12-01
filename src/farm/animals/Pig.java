package farm.animals;

/*
 * @author: Boris Muminovic
 * Version: 1.0
 */
public final class Pig extends Animal {

	private long id;
	private float weight;
	private boolean vaccinated;
	private boolean fed;
	private float weightGainPercentage;
	private static float pricePerKg = 11;

	public Pig(long id, float weight, boolean vaccinated, boolean fed,
			float weightGainPercentage) {

		this.id = id;
		this.weight = weight;
		this.vaccinated = vaccinated;
		this.fed = fed;

		this.weightGainPercentage = weightGainPercentage;

	}

	public long getId() {
		return id;
	}

	public float getWeight() {
		return weight;
	}

	public boolean isVaccinated() {
		return vaccinated;
	}

	public boolean isFed() {
		return fed;
	}

	public float getWeightGainPercentage() {
		return weightGainPercentage;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Pig ID: ");
		buffer.append(id);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Weight: ");
		buffer.append(weight);
		buffer.append(" kg");
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Vaccinated: ");
		buffer.append(vaccinated);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Fed: ");
		buffer.append(fed);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("WeightGainPercentage: ");
		buffer.append(weightGainPercentage);
		buffer.append(" %");
		buffer.append(System.getProperty("line.separator"));
		buffer.append("PricePerKg: ");
		buffer.append(pricePerKg);
		buffer.append(" kn");
		buffer.append(System.getProperty("line.separator"));
		return buffer.toString();
	}

}
