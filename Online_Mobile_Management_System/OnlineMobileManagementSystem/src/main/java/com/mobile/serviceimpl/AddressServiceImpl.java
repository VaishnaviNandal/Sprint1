package com.mobile.serviceimpl;

import com.mobile.dao.AddressDao;
import com.mobile.daoimpl.AddressDaoImpl;
import com.mobile.entity.Address;
import com.mobile.service.AddressService;
import java.util.List;

public class AddressServiceImpl implements AddressService {

    // Creating an instance of AddressDao to interact with the database
    private AddressDao addressDao = new AddressDaoImpl();

    // Creates and saves a new Address entity
    @Override
    public Address createAddress(Address address) {
        return addressDao.saveAddress(address);
    }

    // Retrieves all Address entities from the database
    @Override
    public List<Address> getAllAddresses() {
        return addressDao.getAllAddresses();
    }

    // Fetches an Address entity by its ID
    @Override
    public Address getAddress(String addressId) {
        return addressDao.getAddressById(addressId);
    }

    // Updates an existing Address entity based on the provided ID
    @Override
    public Address updateAddress(String addressId, Address address) {
        return addressDao.updateAddress(addressId, address);
    }

    // Deletes an Address entity based on the provided ID
    @Override
    public String deleteAddress(String addressId) {
        return addressDao.deleteAddress(addressId);
    }
}
