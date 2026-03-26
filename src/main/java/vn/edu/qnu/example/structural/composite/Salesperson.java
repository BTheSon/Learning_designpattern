package vn.edu.qnu.example.structural.composite;

public class Salesperson implements Payee{
    private Manager manager;
    private String name;

    public Salesperson(String name, Manager manager) {
        this.manager = manager;
        this.name = name;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println("Salesperson " + name + " được trả " + amount + " USD (manager: " + manager.toString() + ")");
    }
}
