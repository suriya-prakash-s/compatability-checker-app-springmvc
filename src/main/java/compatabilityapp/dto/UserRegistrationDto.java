package compatabilityapp.dto;

import compatabilityapp.validators.Age;

public class UserRegistrationDto {

	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String[] hobbies;
	private String gender;
	@Age(min = 35, max = 60)
	private Integer age;
	private ComsDto comsDto;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public ComsDto getComsDto() {
		return comsDto;
	}

	public void setComsDto(ComsDto comsDto) {
		this.comsDto = comsDto;
	}

}
