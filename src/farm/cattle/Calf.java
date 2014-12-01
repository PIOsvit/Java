/* 
 * @author: Zerina Salitrežiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.cattle;

public class Calf extends Cattle {

	private long id;
	private String countryOfOrigin;
	private float weight;
	private String sex;
	boolean inBreastFeeding;
	private boolean isCalfFed;

	public Calf(long id, String countryOfOrigin, float weight, String sex,
			boolean inBreastFeeding, boolean isCalfFed) {
		this.id = id;
		this.countryOfOrigin = countryOfOrigin;
		this.weight = weight;
		this.sex = sex;
		this.inBreastFeeding = inBreastFeeding;
		this.isCalfFed = isCalfFed;
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

	public boolean isInBreastFeeding() {
		return inBreastFeeding;
	}

	public boolean isCalfFed() {
		return isCalfFed;
	}
}
