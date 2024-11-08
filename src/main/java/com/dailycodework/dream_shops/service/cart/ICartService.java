package com.dailycodework.dream_shops.service.cart;

import com.dailycodework.dream_shops.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void cleanCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart getCartByUserId(Long userId);
}
