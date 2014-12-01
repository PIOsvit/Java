/* @author: Matija Goršek, Filip Kovaèeviæ, Sara Puljiæ
 * @version: 1.0
 * @date: 23.10.2014.
 */

package farm.statistic.annualReport;

import farm.statistic.Statistic;

public class Income {

	public static float income(Statistic array[]) {
		float suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma = (suma + array[i].getPrice() * array[i].getQuantity());
		}
		return suma;

	}

}
