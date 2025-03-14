import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
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
        }




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
