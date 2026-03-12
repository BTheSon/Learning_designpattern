package vn.edu.qnu.example.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rabbit rabbit = new Rabbit("hello");

        var subRabbit = rabbit.clone();
    }
}
