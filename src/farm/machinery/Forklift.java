/**
 * @author dkopic
 */
package farm.machinery;

public class Forklift extends Machinery {

	private int numberOfWorkingForklift;
	private boolean isFuelLightOn;
	
	public Forklift(boolean maintenance, float fuelConsumption,
			boolean isWorking, boolean isBroken, float amortization) {
		super(maintenance, fuelConsumption, isWorking, isBroken, amortization);
	}

	public void turnOnForklift() {
		System.out.println("Forklift is turned on!");
	}

	public void turnOffForklift() {
		System.out.println("Forklift is turned off!");
	}

	public void repairForklift() {
		System.out.println("Forklift is repaired!");
	}

	public int getNumberOfWorkingForklift() {
		return numberOfWorkingForklift;
	}

	public boolean isFuelLightOn() {
		return isFuelLightOn;
	}

	@Override
	public boolean isMaintenance() {
		return false;
	}

	@Override
	public float getFuelConsumption() {
		return 0;
	}

	@Override
	public boolean isWorking() {
		return false;
	}

	@Override
	public boolean isBroken() {
		return false;
	}

	@Override
	public float getAmortization() {
		return 0;
	}

}
