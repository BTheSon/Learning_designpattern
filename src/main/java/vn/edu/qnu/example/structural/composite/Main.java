package vn.edu.qnu.example.structural.composite;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Alice");
        Manager m2 = new Manager("Bob");

        Salesperson s1 = new Salesperson("John", m1);
        Salesperson s2 = new Salesperson("Emma", m2);

        SalesTeam team = new SalesTeam();
        team.add(m1, m2, s1, s2);

        // trả tiền cho cả team
        team.payExpenses(1000);
    }
}