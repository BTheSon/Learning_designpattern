package vn.edu.qnu.example.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person owner = new Person("Huy");
        Rabbit rabbit = new Rabbit("hello", owner);

        var subRabbit = rabbit.clone();
    }
}
