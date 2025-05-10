package com.mobile.dao;

import com.mobile.entity.Admin;
import java.util.List;

public interface AdminDao {
    Admin saveAdmin(Admin admin);
    Admin getAdminById(String adminId); // Only one method for fetching by ID
    List<Admin> getAllAdmins();
    Admin updateAdmin(String adminId, Admin admin);
    String deleteAdmin(String adminId);
	Admin updateAdmin(Long id, Admin updatedAdmin);
	boolean deleteAdmin(Long id);
	Admin getAdminById(Long id);
}
