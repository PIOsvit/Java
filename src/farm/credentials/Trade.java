
package farm.credentials;

public final class Trade extends Credentials {

	private long id;
	private String name;
	private String owner;
	private long oib;
	private String adress;
	private String contactNumber;
	private String eMail;
	private int numberOfEmployees;
	private boolean healthCertificate;
	private boolean prohibitionOfActivities;
	private boolean tradeLicence;

	public Trade(long id, String name, String owner, long oib, String adress,
			String contactNumber, String eMail, int numberOfEmployees,
			boolean healthCertificate, boolean prohbitionOfActivities,
			boolean tradeLicence) {
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.oib = oib;
		this.adress = adress;
		this.contactNumber = contactNumber;
		this.eMail = eMail;
		this.numberOfEmployees = numberOfEmployees;
		this.healthCertificate = healthCertificate;
		this.prohibitionOfActivities = prohbitionOfActivities;
		this.tradeLicence = tradeLicence;
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
		buffer.append("Craft");
		buffer.append(System.getProperty("line.separator"));
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Health Certificate:");
		buffer.append(healthCertificate);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Prohibition Of Activities:");
		buffer.append(prohibitionOfActivities);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Trade Licence:");
		buffer.append(tradeLicence);
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
		buffer.append("E-Mail:");
		buffer.append(eMail);
		buffer.append(System.getProperty("line.separator"));
		buffer.append("Number Of Employees:");
		buffer.append(numberOfEmployees);
		buffer.append(System.getProperty("line.separator"));
		buffer.append(System.getProperty("line.separator"));
		return buffer.toString();
	}

}
