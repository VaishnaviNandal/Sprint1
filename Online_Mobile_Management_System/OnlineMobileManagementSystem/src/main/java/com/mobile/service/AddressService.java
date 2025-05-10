package com.mobile.service;

import com.mobile.entity.Address;
import java.util.List;

public interface AddressService {
    Address createAddress(Address address);
    List<Address> getAllAddresses();
    Address getAddress(String addressId);
    Address updateAddress(String addressId, Address address);
    String deleteAddress(String addressId);
}
