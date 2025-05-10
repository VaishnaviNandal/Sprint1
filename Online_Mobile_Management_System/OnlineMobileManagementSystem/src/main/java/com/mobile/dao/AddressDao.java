package com.mobile.dao;

import com.mobile.entity.Address;
import java.util.List;

public interface AddressDao {
    Address saveAddress(Address address);
    Address getAddressById(String addressId); // Only one method for fetching by ID
    List<Address> getAllAddresses();
    Address updateAddress(String addressId, Address address);
    String deleteAddress(String addressId);
	boolean deleteAddress(Long id);
	Address updateAddress(Long id, Address updatedAddress);
	Address getAddressById(Long id);
}

