/* 
 * @author: Andrej Naðvegi
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.equipment.cattleGate;

public final class BullGate extends CattleGate {

	private String countryOfOrigin;
	private String type;
	private String material;
	private String color;
	private String dimensions;
	private boolean hasHeadlockForTagging;
	private boolean hasHeadlockForVaccinating;
	private boolean hasHeadlockForDehorning;
	private int numberOfPieces;

	public BullGate(String countryOfOrigin, String type, String material,
			String color, String dimensions, boolean hasHeadlockForTagging,
			boolean hasHeadlockForVaccinating, boolean hasHeadlockForDehorning,
			int numberOfPieces) {
		this.countryOfOrigin = countryOfOrigin;
		this.type = type;
		this.material = material;
		this.color = color;
		this.dimensions = dimensions;
		this.hasHeadlockForTagging = hasHeadlockForTagging;
		this.hasHeadlockForVaccinating = hasHeadlockForVaccinating;
		this.hasHeadlockForDehorning = hasHeadlockForDehorning;
		this.numberOfPieces = numberOfPieces;
	}

	@Override
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getMaterial() {
		return material;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public String getDimensions() {
		return dimensions;
	}

	@Override
	public boolean isHasHeadlockForTagging() {
		return hasHeadlockForTagging;
	}

	@Override
	public boolean isHasHeadlockForVaccinating() {
		return hasHeadlockForVaccinating;
	}

	@Override
	public boolean isHasHeadlockForDehorning() {
		return hasHeadlockForDehorning;
	}

	@Override
	public int getNumberOfPieces() {
		return numberOfPieces;
	}

}
