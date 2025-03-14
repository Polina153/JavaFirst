public class Dog extends Animal implements Swimable, Eatable{
    public Dog(String name, int age, int legs, boolean tail) {
        super(name, age, legs, tail);
    }

    @Override
    void voice() {
        System.out.println("Gaff");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }

    @Override
    public void eat() {

    }
}
