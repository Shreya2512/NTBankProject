package con.nt.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Address {
	private int houseNo;
	
	
	@Pattern(regexp = "^(.+)@(.+)$")
	private String email;
	private String area;
	private String city;

	public Address(int houseNo, String area, String city) {
		super();
		this.houseNo = houseNo;
		this.area = area;
		this.city = city;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
