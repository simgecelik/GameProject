package Entities;

public class Gamer {
	private String tcNo;
	private String firstName;
	private String lastName;
	private int birthYear;

	public Gamer(String tcNo, String firstName, String lastName, int birthYear) {
		super();
		this.tcNo = tcNo;
        this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
