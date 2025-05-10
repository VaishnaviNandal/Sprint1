package com.mobile.service;

import com.mobile.entity.Admin;
import java.util.List;

public interface AdminService {
    Admin createAdmin(Admin admin);
    List<Admin> getAllAdmins();
    Admin getAdmin(String adminId);
    Admin updateAdmin(String adminId, Admin admin);
    String deleteAdmin(String adminId);
}
