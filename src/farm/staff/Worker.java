/* 
 * @author: Zerina Salitrežiæ
 * @date: 31.10.2014.
 * @version: 1.0
 */

package farm.staff;

public final class Worker extends Staff {

	private String name;
	private String surname;
	private long oib;
	private String job;
	private float salary;

	public Worker(String name, String surname, long oib, String job,
			float salary) {
		this.name = name;
		this.surname = surname;
		this.oib = oib;
		this.job = job;
		this.salary = salary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSurname() {
		return surname;
	}

	@Override
	public long getOib() {
		return oib;
	}

	@Override
	public String getJob() {
		return job;
	}

	@Override
	public float getSalary() {
		return salary;
	}
}
