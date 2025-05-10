package com.mobile.dao;

import com.mobile.entity.Cart;
import java.util.List;

public interface CartDao {
    Cart saveCart(Cart cart);
    Cart getCartById(Long id); //Single method for fetching by ID
    List<Cart> getAllCarts();
    Cart updateCart(String cartId, Cart cart);
    String deleteCart(String cartId);
	Cart getCartById(String cartId);
}
