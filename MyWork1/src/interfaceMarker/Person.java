package interfaceMarker;

public class Person implements Cloneable {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public Person clone() {
        try {
            Person cloned = (Person) super.clone();
            cloned.address = this.address.clone(); // Address тоже должен быть Cloneable
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}

class Address implements Cloneable {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Address initialAddress = new Address("Ленина");
        Person original = new Person("Иван", initialAddress);

        Person clone = original.clone();

        System.out.println("--- До изменений ---");
        System.out.println("Оригинал: " + original);
        System.out.println("Клон:     " + clone);

        clone.getAddress().setStreet("Новая");

        System.out.println("\n--- После изменения адреса у Клона ---");
        System.out.println("Оригинал: " + original); // Адрес остался "Ленина"
        System.out.println("Клон:     " + clone);    // Адрес изменился на "Новая"
    }
}