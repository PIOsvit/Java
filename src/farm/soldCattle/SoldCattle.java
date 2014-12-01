/* 
 * @author: Andrej Naðvegi
 * @date: 27.10.2014.
 * @version: 1.0
 */

package farm.soldCattle;

import farm.cattle.Cattle;

public class SoldCattle extends Cattle {

	private long id;
	private String countryOfOrigin;
	private float weight;
	private String sex;

	public SoldCattle(long id, String countryOfOrigin, float weight, String sex) {
		this.id = id;
		this.countryOfOrigin = countryOfOrigin;
		this.weight = weight;
		this.sex = sex;
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

}
