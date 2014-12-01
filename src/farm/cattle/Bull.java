/* 
 * @author: Zerina Salitrežiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.cattle;

public class Bull extends Cattle {

	private long id;
	private String countryOfOrigin;
	private float weight;
	private String sex;
	private boolean inBreeding;
	private int fertilityPerBullPerYear;
	private boolean isBullFed;

	public Bull(long id, String countryOfOrigin, float weight, String sex,
			boolean inBreeding, int fertilityPerBullPerYear, boolean isBullFed) {
		this.id = id;
		this.countryOfOrigin = countryOfOrigin;
		this.weight = weight;
		this.sex = sex;
		this.inBreeding = inBreeding;
		this.fertilityPerBullPerYear = fertilityPerBullPerYear;
		this.isBullFed = isBullFed;
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

	public boolean isInBreeding() {
		return inBreeding;
	}

	public int getFertilityPerBullPerYear() {
		return fertilityPerBullPerYear;
	}

	public boolean isBullFed() {
		return isBullFed;
	}
}
