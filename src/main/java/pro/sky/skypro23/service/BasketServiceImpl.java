package pro.sky.skypro23.service;

import org.springframework.stereotype.Service;
import pro.sky.skypro23.repository.Basket;

import java.util.List;

@Service
public class BasketServiceImpl {
    private final Basket basket;


    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }
    public void addItems(List<Integer> items) {
        basket.addItems(items);

    }

    public  List<Integer> getItems() {
        return basket.getItems();

    }
}


