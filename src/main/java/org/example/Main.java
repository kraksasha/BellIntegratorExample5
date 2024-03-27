package org.example;

public class Main {
    public static void main(String[] args) {
        BasketRepository basketRepository = new BasketRepository();
        basketRepository.addProduct("beef",100);
        basketRepository.addProduct("cheese",60);
        System.out.println(basketRepository.getProducts());
        basketRepository.updateProductQuantity("cheese",80);
        System.out.println(basketRepository.getProducts());
        System.out.println(basketRepository.getProductQuantity("beef"));
        basketRepository.clear();
        System.out.println(basketRepository.getProducts());
    }
}