package vn.edu.qnu.example.creational.prototype;

public class Rabbit implements Cloneable {
    private String name;
    private Person owner;
    public Rabbit(String name, Person owner) {
        this.name = name;
        this.owner = owner;
    }

    public Rabbit(Rabbit someRabbit) {
        this.name = someRabbit.name;                // shallow copy
        this.owner = new Person(someRabbit.owner);  // deep copy
    }

    @Override
    protected Rabbit clone() throws CloneNotSupportedException {
        return new Rabbit(this);
    }
}
