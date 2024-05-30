package com.cart.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;
    @Autowired
    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void addItem(@RequestParam("itemIds") List<Integer> itemIds) {
        System.out.println("itemIds = " + itemIds);
        itemIds.forEach(basketService::addItem);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return basketService.getItemIds();
    }
}
