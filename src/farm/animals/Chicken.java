package farm.animals;

/*
 * @author: Boris Muminovic
 * Version: 1.0
 */
public final class Chicken extends Animal {

	private long id;
	private float weight;
	private boolean vaccinated;
	private boolean fed;
	private boolean laysEggs;
	private int eggsLaidPerDay;
	private static float pricePerKg = 25;

	public Chicken(long id, float weight, boolean vaccinated, boolean fed,
			int eggsLaidPerDay) {

		this.id = id;
		this.weight = weight;
		this.vaccinated = vaccinated;
		this.fed = fed;

		this.eggsLaidPerDay = eggsLaidPerDay;
		if (eggsLaidPerDay > 0) {
			laysEggs = true;
		} else {
			laysEggs = false;
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

	public boolean isLaysEggs() {
		return laysEggs;
	}

	public int getEggsLaid() {
		return eggsLaidPerDay;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Chicken ID: ");
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
		buffer.append("LaysEggs: ");
		buffer.append(laysEggs);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("EggsLaidPerDay: ");
		buffer.append(eggsLaidPerDay);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("PricePerKg: ");
		buffer.append(pricePerKg);
		buffer.append(" kn");
		buffer.append(System.getProperty("line.separator"));
		return buffer.toString();
	}

}
