package com.cart.cart;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Basket {
    private List<Integer> itemIds;

    public Basket() {
        this.itemIds = new ArrayList<>();
    }

    public void addItem(int itemId) {
        this.itemIds.add(itemId);
    }

    public List<Integer> getItemIds() {
        return new ArrayList<>(itemIds);
    }
}
