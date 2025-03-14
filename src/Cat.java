public class Cat extends Animal{
    public Cat(String name, int age, int legs, boolean tail) {
        super(name, age, legs, tail);
    }

    public Cat(){
        super("Animal", -1, 4, true);
    }

    @Override
    void voice() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
