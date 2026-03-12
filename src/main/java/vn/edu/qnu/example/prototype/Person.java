package vn.edu.qnu.example.prototype;

public class Person implements Cloneable{
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public Person(Person some) {
        this.name = some.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return new Person(this);
    }
}
