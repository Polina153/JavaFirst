class Turtle extends Animal implements Swimable{
    public Turtle(String name, int age, int legs, boolean tail) {
        super(name, age, legs, tail);
    }

    @Override
    void voice() {
        System.out.println("This is silent");
    }

    @Override
    void printInfo() {
        System.out.println("Water animal");
        super.printInfo();

    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}
