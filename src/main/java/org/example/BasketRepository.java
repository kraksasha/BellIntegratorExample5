package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketRepository implements Basket{

    private Map<String, Integer> map;

    public BasketRepository() {
        map = new HashMap<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        map.put(product,quantity);
    }

    @Override
    public void removeProduct(String product) {
        map.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        map.put(product,quantity);
    }

    @Override
    public void clear() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            list.add(entry.getKey());
        }
        for (int i = 0; i < list.size(); i++){
            map.remove(list.get(i));
        }
    }

    @Override
    public List<String> getProducts() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            list.add(entry.getKey() + " : " + entry.getValue());
        }
        return list;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getKey().equals(product)){
                return entry.getValue();
            }
        }
        return 0;
    }
}
