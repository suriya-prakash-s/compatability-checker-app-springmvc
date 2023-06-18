package compatabilityapp.dto;

public class PhoneDto {
	
	private String countryCode;
	private String phoneNumber;
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return countryCode + "-" + phoneNumber;
	}
	
	

}
