package com.mobile.dao;

import com.mobile.entity.User;
import java.util.List;

public interface UserDao {
    // Save
    User saveUser(User user);

    // Find
    User getUserById(Long id);
    List<User> getAllUsers();

    // Update
    User updateUser(Long id, User user);  //  Use `Long id`

    // Delete
    boolean deleteUser(Long id);  //  Returns `boolean`

	User getUserById(String userId);

	User updateUser(String userId, User user);

	String deleteUser(String userId);
}
