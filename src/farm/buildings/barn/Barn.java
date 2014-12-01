/* 
 * @author: Domagoj Samardžiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.buildings.barn;

public abstract class Barn {

	public abstract String getType();

	public abstract int getCadastralPlot();

	public abstract float getSurface();

	public abstract String getDimensions();

	public abstract int getCapacity();

	public abstract int getNumberOfCattle();

	public abstract float usedCapacityPercentage();

}
