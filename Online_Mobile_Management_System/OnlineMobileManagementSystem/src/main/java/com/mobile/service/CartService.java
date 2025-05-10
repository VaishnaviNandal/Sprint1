package com.mobile.service;

import com.mobile.entity.Cart;
import java.util.List;

public interface CartService {
    Cart addToCart(Cart cart);
    List<Cart> getAllCartItems();
    Cart getCartItem(String cartId);
    Cart updateCartItem(String cartId, Cart cart);
    String deleteCartItem(String cartId);
	List<Cart> getCartItems();
	void removeFromCart(int cartId);
	void checkout();
	Cart addToCart(String customerId, int mobileId, int qty);
	void removeFromCart(String itemId);
}
