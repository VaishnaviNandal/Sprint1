package com.mobile.service;

import com.mobile.entity.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User getUser(String userId);
    User updateUser(int updateId, User user);
    String deleteUser(int deleteId);
	User updateUser(String userId, User user);
	String deleteUser(String userId);
}
