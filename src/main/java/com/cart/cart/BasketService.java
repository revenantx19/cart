package com.cart.cart;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;


@Service
@RequestScope
public class BasketService {
    private final Basket basket;

    public BasketService() {
        this.basket = new Basket();
    }

    public void addItem(int itemId) {
        basket.addItem(itemId);
    }

    public List<Integer> getItemIds() {
        return basket.getItemIds();
    }
}