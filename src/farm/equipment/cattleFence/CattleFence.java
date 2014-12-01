/* 
 * @author: Zerina Salitrežiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.equipment.cattleFence;

public final class CattleFence {

	private String countryOfOrigin;
	private String material;
	private String color;
	private String dimensions;
	private int numberOfPieces;

	public CattleFence(String countryOfOrigin, String material, String color,
			String dimensions, int numberOfPieces) {
		this.countryOfOrigin = countryOfOrigin;
		this.material = material;
		this.color = color;
		this.dimensions = dimensions;
		this.numberOfPieces = numberOfPieces;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}

	public String getDimensions() {
		return dimensions;
	}

	public int getNumberOfPieces() {
		return numberOfPieces;
	}

}
