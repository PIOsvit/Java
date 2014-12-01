/**
 * @author dkopic
 */
package farm.machinery;

public class Machinery {

	private boolean maintenance;
	private float fuelConsumption;
	private boolean isWorking;
	private boolean isBroken;
	private float amortization;

	public Machinery(boolean maintenance, float fuelConsumption,
			boolean isWorking, boolean isBroken, float amortization) {
		this.maintenance = maintenance;
		this.fuelConsumption = fuelConsumption;
		this.isWorking = isWorking;
		this.isBroken = isBroken;
		this.amortization = amortization;
	}

	public boolean isMaintenance() {
		return maintenance;
	}

	public float getFuelConsumption() {
		return fuelConsumption;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public boolean isBroken() {
		return isBroken;
	}

	public float getAmortization() {
		return amortization;
	}

}
