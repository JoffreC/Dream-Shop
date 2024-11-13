package com.dailycodework.dream_shops.dto;

import com.dailycodework.dream_shops.model.Cart;
import com.dailycodework.dream_shops.model.Order;
import org.hibernate.annotations.NaturalId;

import java.util.List;

public class UserDto {
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;

    private List<OrderDto> orders;
    private CartDto cart;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }

    public CartDto getCart() {
        return cart;
    }

    public void setCart(CartDto cart) {
        this.cart = cart;
    }
}
