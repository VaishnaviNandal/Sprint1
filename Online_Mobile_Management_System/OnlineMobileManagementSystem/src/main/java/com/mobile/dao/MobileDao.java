package com.mobile.dao;

import com.mobile.entity.Mobile;
import java.util.List;

public interface MobileDao {
    // Save
    Mobile save(Mobile mobile);

    // Find
    Mobile findById(Long id);
    List<Mobile> findAll();

    // Update
    Mobile updateMobile(Long id, Mobile mobile); //  Standardized to use Long ID

    // Delete
    boolean deleteById(Long id); //  Return boolean for success/failure

	Mobile saveMobile(Mobile mobile);

	Mobile getMobileById(Long id);

	List<Mobile> getAllMobiles();

	void update(Mobile mobile);

	void delete(Long id);

	Mobile getMobileById(String mobileId);

	Mobile updateMobile(String mobileId, Mobile mobile);

	String deleteMobile(String mobileId);
}