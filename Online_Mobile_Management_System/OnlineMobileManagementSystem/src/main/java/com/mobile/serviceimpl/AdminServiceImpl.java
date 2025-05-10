package com.mobile.serviceimpl;

import com.mobile.dao.AdminDao;
import com.mobile.daoimpl.AdminDaoImpl;
import com.mobile.entity.Admin;
import com.mobile.service.AdminService;
import java.util.List;

public class AdminServiceImpl implements AdminService {

    // Creating an instance of AdminDao to interact with the database
    private AdminDao adminDao = new AdminDaoImpl();

    // Creates and saves a new Admin entity
    @Override
    public Admin createAdmin(Admin admin) {
        return adminDao.saveAdmin(admin);
    }

    // Retrieves all Admin entities from the database
    @Override
    public List<Admin> getAllAdmins() {
        return adminDao.getAllAdmins();
    }

    // Fetches an Admin entity by its ID
    @Override
    public Admin getAdmin(String adminId) {
        return adminDao.getAdminById(adminId);
    }

    // Updates an existing Admin entity based on the provided ID
    @Override
    public Admin updateAdmin(String adminId, Admin admin) {
        return adminDao.updateAdmin(adminId, admin);
    }

    // Deletes an Admin entity based on the provided ID
    @Override
    public String deleteAdmin(String adminId) {
        return adminDao.deleteAdmin(adminId);
    }
}
