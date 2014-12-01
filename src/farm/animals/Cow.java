package farm.animals;

/*
 * @author: Boris Muminovic
 * Version: 1.0
 */
public final class Cow extends Animal {

	private long id;
	private float weight;
	private boolean vaccinated;
	private boolean fed;
	private boolean producesMilk;
	private float milkProducedPerDay;
	private static float pricePerKg = 20;

	public Cow(long id, float weight, boolean vaccinated, boolean fed,
			float milkProducedPerDay) {

		this.id = id;
		this.weight = weight;
		this.vaccinated = vaccinated;
		this.fed = fed;

		this.milkProducedPerDay = milkProducedPerDay;
		if (milkProducedPerDay > 0) {
			producesMilk = true;
		} else {
			producesMilk = false;

		}

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

	public boolean isProducesMilk() {
		return producesMilk;
	}

	public float getMilkProducedPerDay() {
		return milkProducedPerDay;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Cow ID: ");
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
		buffer.append("ProducesMilk: ");
		buffer.append(producesMilk);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("MilkProducedPerDay: ");
		buffer.append(milkProducedPerDay);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("PricePerKg: ");
		buffer.append(pricePerKg);
		buffer.append(" kn");
		buffer.append(System.getProperty("line.separator"));
		return buffer.toString();
	}

}
