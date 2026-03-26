package vn.edu.qnu.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {
    private List<Payee> members = new ArrayList<>();

    public void add(Payee... payees) {
        for (Payee p : payees) {
            members.add(p);
        }
    }

    @Override
    public void payExpenses(int amount) {
        for (Payee p : members) {
            p.payExpenses(amount);
        }
    }
}