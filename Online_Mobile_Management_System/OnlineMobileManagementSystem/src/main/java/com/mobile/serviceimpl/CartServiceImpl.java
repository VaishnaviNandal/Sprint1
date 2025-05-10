package com.mobile.serviceimpl;

import com.mobile.dao.CartDao;
import com.mobile.daoimpl.CartDaoImpl;
import com.mobile.entity.Cart;
import com.mobile.service.CartService;

import java.util.List;

public class CartServiceImpl implements CartService {
    private CartDao cartDao = new CartDaoImpl();

    @Override
    public Cart addToCart(Cart cart) {
        return cartDao.saveCart(cart);
    }

    @Override
    public List<Cart> getAllCartItems() {
        return cartDao.getAllCarts();
    }

    @Override
    public Cart getCartItem(String cartId) {
        return cartDao.getCartById(cartId);
    }

    @Override
    public Cart updateCartItem(String cartId, Cart cart) {
        return cartDao.updateCart(cartId, cart);
    }

    @Override
    public String deleteCartItem(String cartId) {
        return cartDao.deleteCart(cartId);
    }

	@Override
	public List<Cart> getCartItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeFromCart(String itemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFromCart(int cartId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cart addToCart(String customerId, int mobileId, int qty) {
		// TODO Auto-generated method stub
		return null;
	}
}
