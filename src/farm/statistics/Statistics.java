/* 
 * @author: Zerina Salitrežiæ
 * @date: 28.10.2014.
 * @version: 1.0
 */

package farm.statistics;

import farm.statistics.expenses.Expenses;
import farm.statistics.incomes.Incomes;

public class Statistics {

	public Incomes mIncomes;
	public Expenses mExpenses;

	public Statistics(Incomes incomes, Expenses expenses) {
		this.mIncomes = incomes;
		this.mExpenses = expenses;
	}

	public Incomes getmIncomes() {
		return mIncomes;
	}

	public Expenses getmExpenses() {
		return mExpenses;
	}
}
