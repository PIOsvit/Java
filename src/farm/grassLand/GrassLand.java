/* 
 * @author: Domagoj Samardžiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.grassLand;

public final class GrassLand {

	private int cadastralPlot;
	private int dimensions;

	public GrassLand(int caddastralPlot, int dimension) {
		this.cadastralPlot = caddastralPlot;
		this.dimensions = dimension;
	}

	public int getCadastralPlot() {
		return cadastralPlot;
	}

	public int getDimensions() {
		return dimensions;
	}

}
