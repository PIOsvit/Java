/* 
 * @author: Andrej Naðvegi
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.equipment.cattleGate;

public abstract class CattleGate {

	public abstract String getCountryOfOrigin();

	public abstract String getType();

	public abstract String getMaterial();

	public abstract String getColor();

	public abstract String getDimensions();

	public abstract boolean isHasHeadlockForTagging();

	public abstract boolean isHasHeadlockForVaccinating();

	public abstract boolean isHasHeadlockForDehorning();

	public abstract int getNumberOfPieces();

}
