package farm.animalsOnFarm.pig;

import farm.animalsOnFarm.AnimalsOnFarm;

public class Pig extends AnimalsOnFarm {

	public Pig(long ID, String sex, float averageAge, float averageWeight) {
		super(ID, sex, averageAge, averageWeight);
		// TODO Auto-generated constructor stub
	}

	public long getID() {
		return ID;
	}

	public String getSex() {
		// TODO Auto-generated method stub
		return sex;
	}

	public float getAverageAge() {
		// TODO Auto-generated method stub
		return averageAge;
	}

	public float getAverageWeight() {
		// TODO Auto-generated method stub
		return averageWeight;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Pig ID = ");
		buffer.append(getID());
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Sex = ");
		buffer.append(getSex());
		buffer.append(System.getProperty("line.separator"));
		buffer.append("AverageAge = ");
		buffer.append(getAverageAge());
		buffer.append(System.getProperty("line.separator"));
		buffer.append("AverageWeight = ");
		buffer.append(getAverageWeight());
		return buffer.toString();
	}

}
