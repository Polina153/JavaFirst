import java.util.Scanner;
import java.util.*;

public class Main {
    //Задача:
    //Даны классы Apple и Orange;

    //Класс Basket, в который можно складывать фрукты. Корзины условно сортируются по типу фрукта, поэтому в одну корзину
    //нельзя сложить и яблоки, и апельсины. Есть возможность создавать смешанные корзины, куда можно складывать любые фрукты;

    //Для хранения фруктов внутри корзины можно использовать ArrayList;

    //Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    // вес яблока – 1.0, апельсина – 1.5;

    //Внутри класса Basket сделать методы:
    //  - add() для добавления фруктов
    //  - compare(), который позволяет сравнить текущую корзину с той, которую подадут в compare() в качестве параметра.
    // Можно сравнивать корзины с разными фруктами;

    // * Написать метод, который позволяет пересыпать фрукты из текущей корзины в другую.
    // Помним про сортировку фруктов: нельзя яблоки высыпать в корзину для апельсинов, только в корзину для яблок или же смешанную.
    // Соответственно, в текущей корзине фруктов не остается, а в другую перекидываются объекты, которые были в первой;

    public static void main(String[] args) {

        int a, b;
        try {
            a = 0;
            b = 10 / a;
            System.out.println("Это сообщение не будет выведено в консоль");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (Exception e){
            System.out.println("Some exception");
        } finally {
            System.out.println("Завершение работы");
        }




        Basket<Orange> orangeBasket = new Basket<>();
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        System.out.println("Orange basket weight is: " + orangeBasket.getBasketWeight());

        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.add(new Apple());
        System.out.println("Apple basket weight is: " + appleBasket.getBasketWeight());

        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.add(new Orange());
        fruitBasket.add(new Apple());
        System.out.println("Fruit basket weight is: " + fruitBasket.getBasketWeight());


        System.out.println(orangeBasket.compare(appleBasket));
        System.out.println(appleBasket.compare(appleBasket));
        System.out.println(appleBasket.compare(orangeBasket));

        Basket<Orange> orangeBasket2 = new Basket<>();
        orangeBasket2.add(new Orange());

        System.out.println("First case");
        Basket.transfer(orangeBasket, orangeBasket2);
        System.out.println("Orange basket2 weight is: " + orangeBasket2.getBasketWeight());
        System.out.println("Orange basket weight is: " + orangeBasket.getBasketWeight());

        /*System.out.println("Second case");
        Basket.transfer(appleBasket, orangeBasket2);
        System.out.println("Orange basket2 weight is: " + orangeBasket2.getBasketWeight());
        System.out.println("Orange basket weight is: " + appleBasket.getBasketWeight());*/

        System.out.println("Third case");
        Basket.transfer(appleBasket, fruitBasket);
        System.out.println("Fruit basket weight is: " + fruitBasket.getBasketWeight());
        System.out.println("Apple basket weight is: " + appleBasket.getBasketWeight());









        /*MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Denis");
        myArrayList.add("Masha");
        myArrayList.add("Rita");
        myArrayList.add("Oleg");
        myArrayList.add("Kate");
        for(int i = 0; i < myArrayList.getSize(); i++){
            System.out.println(myArrayList.get(i));
        }
        myArrayList.remove("Denis");
        System.out.println();
        for(int i = 0; i < myArrayList.getSize(); i++){
            System.out.println(myArrayList.get(i));
        }*/
       /* int[] daysOfMonth = new int[12];
        daysOfMonth[0] = 31;
        daysOfMonth[1] = 29;
        daysOfMonth[2] = 31;
        daysOfMonth[3] = 30;
        daysOfMonth[4] = 31;
        daysOfMonth[5] = 30;
        daysOfMonth[6] = 31;
        daysOfMonth[7] = 31;
        daysOfMonth[8] = 30;
        daysOfMonth[9] = 31;
        daysOfMonth[10] = 30;
        daysOfMonth[11] = 31;
        System.out.println(daysOfMonth);
        int sum = 0;
        for (int i : daysOfMonth) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println(sum);
*/
/*        Box box = new Box(3.4, 4.4, 6.66);
        System.out.println(box.getHeight());
        box.showVolume();
        box.setHeight(10);
        System.out.println(box.getHeight());
        box.showVolume();
        System.out.println(Box.amountOfBoxes);*/
       /* System.out.println(MyMath.sum(3,6,78,9,0));


        Cat cat1 = new Cat("Murzik", 3, 4, true);
        Cat cat = new Cat();
        cat.printInfo();
        Dog dog1 = new Dog("Tuzik", 1, 4, true);
        Turtle turtle = new Turtle("Marusya", 100, 4, true);
        turtle.swim();
        turtle.voice();
        dog1.swim();

        turtle.printInfo();
        cat1.printInfo();
        cat1.voice();
        dog1.printInfo();
        dog1.voice();
        System.out.println(cat1);
        System.out.println(dog1);*/
        //System.out.println("Hello world!");
        //int age = 18;
        /*byte age = 127;
        System.out.println(age);
        age += 205;
        System.out.println(age);
        System.out.println(18 % 4);
        //calculateSeconds();
        //switchMethod();
        conditioning();*/
       /* int summ = 0;
        for (int a = 0;a <= 100; a++) {
            summ += a;
        }
        System.out.println("Сумма всех чисел от 1 до 100 (включительно) равна " + summ);
*/
      /*  int i = 1000;
        while (i >= 0) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }

        int a = 0;
        do {
            System.out.println("Hello!");
        } while(a > 0);*/
    }

    private static void conditioning() {
        boolean isHot = false;
        if (isHot) {
            System.out.println("Conditioner is cooling");
        } else {
            System.out.println("Conditioner is off");
        }
    }

    private static void switchMethod() {
        System.out.println("Enter number from 1 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //int number = -3;
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("введите число от 1 до 5!");
        }

   /* private static void calculateSeconds() {
        System.out.println("Enter amount of seconds: ");
        Scanner scanner = new Scanner(System.in);
        int secondsFromUser = scanner.nextInt();
        int days = (secondsFromUser / 60 / 60 / 24);
        int hours = (secondsFromUser / 60 / 60) % 24;
        int minutes = (secondsFromUser / 60) % 60;
        int seconds = secondsFromUser % minutes;
        System.out.println("There are " + days + " days");
        System.out.println("There are " + hours + " hours");
        System.out.println("There are " + minutes + " minutes");
        System.out.println("There are " + seconds + " seconds");
    }*/

    }
}
