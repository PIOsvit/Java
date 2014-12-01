/* @author: Matija Goršek, Filip Kovaèeviæ, Sara Puljiæ
 * @version: 1.0
 * @date: 23.10.2014.
 */

package farm.statistic;

public class Statistic {

	private int quantity;
	private float theAverageWeight;
	private float theAverageAge;
	private float price;

	public Statistic(int quantity, float theAverageWeight, float theAverageAge,
			float price) {
		this.quantity = quantity;
		this.theAverageWeight = theAverageWeight;
		this.theAverageAge = theAverageAge;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public float getTheAverageWeight() {
		return theAverageWeight;
	}

	public float getTheAverageAge() {
		return theAverageAge;
	}

	public float getPrice() {
		return price;
	}

	public String toString() {
		return " [quantity = " + quantity + ", theAverageWeight = "
				+ theAverageWeight + ", theAverageAge = " + theAverageAge
				+ ", price=" + price + "]";
	}

}
