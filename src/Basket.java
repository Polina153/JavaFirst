import java.util.ArrayList;
import java.util.List;

class Basket<T extends Fruit> implements BasketInterface<T> {

    private final List<T> basketOfFruits;

    public Basket() {
        basketOfFruits = new ArrayList<>();
    }

    @Override
    public void add(T fruit) {
        basketOfFruits.add(fruit);
    }

    @Override
    public double getBasketWeight() {
        double weightOfBasket = 0;
        for (T fruit : basketOfFruits) {
            weightOfBasket += fruit.getWeight();
        }
        return weightOfBasket;
    }

    @Override
    public int compare(Basket<? extends Fruit> another) {
        if (getBasketWeight() > another.getBasketWeight()) {
            return 1;
        } else if (getBasketWeight() < another.getBasketWeight()) {
            return -1;
        } else {
            return 0;
        }
    }

    static <U extends Fruit> void transfer(Basket<? extends U> first, Basket<? super U>  second){
        second.basketOfFruits.addAll(first.basketOfFruits);
        first.basketOfFruits.clear();
    }
}
