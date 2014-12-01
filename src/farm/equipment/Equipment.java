package farm.equipment;

public abstract class Equipment {

	protected long ID;
	protected String manufacturer;
	protected String usage;
	protected float price;

	public abstract long getID();

	public abstract String getManufacturer();

	public abstract String getUsage();

	public abstract float getPrice();
}
