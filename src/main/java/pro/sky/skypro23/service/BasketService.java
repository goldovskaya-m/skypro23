package pro.sky.skypro23.service;

import java.util.List;

public interface BasketService {
    void addItems(List<Integer> items);

    List<Integer> getItems();
}


