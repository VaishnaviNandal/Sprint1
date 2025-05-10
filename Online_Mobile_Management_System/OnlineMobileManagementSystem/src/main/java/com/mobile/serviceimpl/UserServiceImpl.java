package com.mobile.serviceimpl;

import com.mobile.dao.UserDao;
import com.mobile.daoimpl.UserDaoImpl;
import com.mobile.entity.User;
import com.mobile.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public User createUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUser(String userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public User updateUser(String userId, User user) {
        return userDao.updateUser(userId, user);
    }

    @Override
    public String deleteUser(String userId) {
        return userDao.deleteUser(userId);
    }

	@Override
	public User updateUser(int updateId, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(int deleteId) {
		// TODO Auto-generated method stub
		return null;
	}
}
