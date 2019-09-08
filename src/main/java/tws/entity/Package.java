package tws.entity;

public class Package {
	private String number;
	private String user;
	private String telephone;
	private String weight;
	private String state;
	private String dateTime;

	public Package(String number, String user, String telephone, String weight, String state, String dateTime) {
		this.number = number;
		this.user = user;
		this.telephone = telephone;
		this.weight = weight;
		this.state = state;
		this.dateTime = dateTime;
	}

	public Package() {
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Package{" + "number='" + number + '\'' + ", user='" + user + '\''
				+ ", telephone='" + telephone + '\'' + ", weight='" + weight + '\'' + ", state=" + state
				+ ", dateTime='" + dateTime + '\'' + '}';
	}

}
