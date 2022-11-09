package com.asc.model;

public class Admin {
	private int adminId;
	private String name;
	private String address;
	private String email;
	private String password;
	public Admin() {
		super();
	}
	public Admin(int adminId, String name, String address, String email, String password) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
}
