package com.mobile.serviceimpl;

import com.mobile.dao.MobileDao;
import com.mobile.daoimpl.MobileDaoImpl;
import com.mobile.entity.Cart;
import com.mobile.entity.Customer;
import com.mobile.entity.Mobile;
import com.mobile.entity.Orders;
import com.mobile.service.MobileService;

import java.util.List;

public class MobileServiceImpl implements MobileService {
    private MobileDao mobileDao = new MobileDaoImpl();

    @Override
    public Mobile createMobile(Mobile mobile) {
        return mobileDao.saveMobile(mobile);
    }

    @Override
    public List<Mobile> getAllMobiles() {
        return mobileDao.getAllMobiles();
    }

    @Override
    public Mobile getMobile(String mobileId) {
        return mobileDao.getMobileById(mobileId);
    }

    @Override
    public Mobile updateMobile(String mobileId, Mobile mobile) {
        return mobileDao.updateMobile(mobileId, mobile);
    }

    @Override
    public String deleteMobile(String mobileId) {
        return mobileDao.deleteMobile(mobileId);
    }

	@Override
	public void saveOrder(Orders order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(String customerId, Customer updatedCustomer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCustomer(String deleteId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelOrder(String orderId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToCart(Cart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cart> getCartItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFromCart(String itemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mobile getMobile(int mId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mobile updateMobile(int mId, Mobile updatedData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteMobile(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}