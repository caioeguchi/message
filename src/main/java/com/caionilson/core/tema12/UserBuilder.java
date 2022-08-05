package com.caionilson.core.tema12;

public class UserBuilder {

	private User user;

	public UserBuilder() {
		this.user = new User();
	}

	public static UserBuilder builder() {
		return new UserBuilder();
	}

	public UserBuilder userName(String name) {
		this.user.setName(name);
		return this;
	}

	public UserBuilder userBirthday(String birthday) {
		this.user.setBirthday(birthday);
		return this;
	}

	public UserBuilder userAddress(String road, String number, String state, String city) {
		Address address = new Address();
		address.setRoad(road);
		address.setNumber(number);
		address.setCity(city);
		address.setState(state);
		this.user.setAddress(address);
		return this;
	}

	public User build() {
		return this.user;
	}

}
