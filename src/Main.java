import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        //int age = 18;
        byte age = 127;
        System.out.println(age);
        age += 205;
        System.out.println(age);
        System.out.println(18 % 4);
        //calculateSeconds();
        //switchMethod();
        conditioning();
    }

    private static void conditioning() {
        boolean isHot = false;
        if(isHot){
            System.out.println("Conditioner is cooling");
        } else{
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
