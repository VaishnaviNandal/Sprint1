package com.mobile.entity;

import javax.persistence.*;



@Entity
@Table(name = "admins")
@DiscriminatorValue("ADMIN") // Used in Single Table Inheritance (if applicable)
public class Admin extends User {

    @Column(name = "admin_id", unique = true, nullable = false)
    private String adminId;

    @Column(name = "role", nullable = false)
    private String role = "ADMIN"; // Default role is ADMIN

    //  Getters and Setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //  Constructors
    public Admin(int id, String name, String email, String password, String adminId, String role) {
        super(id, name, email, password);
        this.adminId = adminId;
        this.role = role;
    }

    public Admin() {
        super();
        // Default constructor for Hibernate
    }

    public Admin(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    //  toString() method for debugging
    @Override
    public String toString() {
        return "Admin [adminId=" + adminId + ", role=" + role + ", User=" + super.toString() + "]";
    }
}
