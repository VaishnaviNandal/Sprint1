package com.mobile.entity;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // other common fields

    private String name;
    private String email;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public User(int id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	public void setAddress(Address address2) {
		// TODO Auto-generated method stub
		
	}
	
}
