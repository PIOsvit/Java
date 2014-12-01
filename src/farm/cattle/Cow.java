/* 
 * @author: Zerina Salitrežiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.cattle;

public class Cow extends Cattle {

	private long id;
	private String countryOfOrigin;
	private float weight;
	private String sex;
	private boolean inMilking;
	private float milkPerCowPerDay;
	private boolean isCowFed;

	public Cow(long id, String countryOfOrigin, float weight, String sex,
			boolean inMilking, float milkPerCowPerDay, boolean isCowFed) {
		this.id = id;
		this.countryOfOrigin = countryOfOrigin;
		this.weight = weight;
		this.sex = sex;
		this.milkPerCowPerDay = milkPerCowPerDay;
		this.inMilking = inMilking;
		this.isCowFed = isCowFed;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	@Override
	public float getWeight() {
		return weight;
	}

	@Override
	public String getSex() {
		return sex;
	}

	public boolean isInMilking() {
		return inMilking;
	}

	public float getMilkPerCowPerDay() {
		return milkPerCowPerDay;
	}

	public boolean isCowFed() {
		return isCowFed;
	}
}
