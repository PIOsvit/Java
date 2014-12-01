package farm.animalsOnFarm;

public abstract class AnimalsOnFarm {

	protected long ID;
	protected String sex;
	protected float averageAge;
	protected float averageWeight;

	public AnimalsOnFarm(long ID, String sex, float averageAge,
			float averageWeight) {
		this.ID = ID;
		this.sex = sex;
		this.averageAge = averageAge;
		this.averageWeight = averageWeight;
	}

	protected abstract long getID();

	protected abstract String getSex();

	protected abstract float getAverageAge();

	protected abstract float getAverageWeight();
}
