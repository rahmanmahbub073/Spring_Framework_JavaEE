package com.practice.sm.api;

public class StudentDTO {
	/*
	 * purpose:1 private String name = "Mahbub"; private long mobile = 158968555L;
	 * private String country ="BD";
	 */
	private String name;
	// private long mobile; it show "0" in form
	private Long mobile;
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	/*
	 * public long getMobile() { return mobile; } public void setMobile(long mobile)
	 * { this.mobile = mobile; }
	 */
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", mobile=" + mobile + ", country=" + country + "]";
	}

}
