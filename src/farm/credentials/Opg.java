package farm.credentials;

public final class Opg extends Credentials {

	private long id;
	private String name;
	private String owner;
	private long oib;
	private String adress;
	private String contactNumber;
	private String eMail;
	private int numberOfEmployees;
	private int registryNumber;
	private String accountant;
	private boolean registry;

	public Opg(long id, String name, String owner, long oib, String adress,
			String contactNumber, String eMail, int numberOfEmployees,
			int registryNumber, String accountant, boolean registry) {
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.oib = oib;
		this.adress = adress;
		this.contactNumber = contactNumber;
		this.eMail = eMail;
		this.numberOfEmployees = numberOfEmployees;
		this.registryNumber = registryNumber;
		this.accountant = accountant;
		this.registry = registry;
	}

	public long getId() {

		return id;
	}

	public String getName() {

		return name;
	}

	public String getOwner() {

		return owner;
	}

	public long getOib() {

		return oib;
	}

	public String getAdress() {

		return adress;
	}

	public String getContactNumber() {

		return contactNumber;
	}

	public String geteMail() {

		return eMail;
	}

	public int getNumberOfEmployees() {

		return numberOfEmployees;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Opg");
		buffer.append(System.getProperty("line.separator"));
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Registry Number:");
		buffer.append(registryNumber);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Accountant:");
		buffer.append(accountant);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Registry:");
		buffer.append(registry);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Id:");
		buffer.append(id);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Name:");
		buffer.append(name);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Owner:");
		buffer.append(owner);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Oib:");
		buffer.append(oib);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Adress:");
		buffer.append(adress);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Contact Number:");
		buffer.append(contactNumber);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("E Mail:");
		buffer.append(eMail);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Number Of Employees:");
		buffer.append(numberOfEmployees);
		buffer.append(System.getProperty("line.separator"));
		buffer.append(System.getProperty("line.separator"));
		return buffer.toString();
	}

}
