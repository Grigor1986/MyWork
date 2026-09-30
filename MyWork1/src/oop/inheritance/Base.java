package oop.inheritance;


public class Base {
    private int value;

    public Base(int value) {
        this.value = value;
    }

    public Base() {
    }
}

class Derived extends Base {
    private String name;

    public Derived() {
        this.name = "default";
    }

    public Derived(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Derived{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Derived derived = new Derived();
        System.out.println(derived);
    }
}
