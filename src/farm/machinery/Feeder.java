/**
 * @author dkopic
 */
package farm.machinery;

public class Feeder extends Machinery {

	public Feeder(boolean maintenance, float fuelConsumption,
			boolean isWorking, boolean isBroken, float amortization) {
		super(maintenance, fuelConsumption, isWorking, isBroken, amortization);
	}

	public void turnOnFeeder() {
		System.out.println("Feeder is turned on!");
	}

	public void turnOffFeeder() {
		System.out.println("Feeder is turned off!");
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

	@Override
	public boolean isMaintenance() {
		return false;
	}

}
