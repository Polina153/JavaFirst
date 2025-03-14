abstract class Animal {
    String name;
    int age;
    int legs;
    boolean tail;

    public Animal(String name, int age, int legs, boolean tail) {
        this.name = name;
        this.age = age;
        this.legs = legs;
        this.tail = tail;
    }

    void printInfo(){
        System.out.printf("This %s is %s years old and has %s legs and tail is %s. \n", name, age, legs, tail);
    }
    abstract void voice();
}
