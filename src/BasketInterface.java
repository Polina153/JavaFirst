interface BasketInterface <T>  {

    void add(T fruit);

    double getBasketWeight();

    int compare(Basket<? extends Fruit> another);
}

