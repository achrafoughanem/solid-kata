package com.codurance.ocp;

public class ManagerEmployee extends Employee {
    ManagerEmployee(int salary, int bonus) {
        super(salary, bonus);
    }

    @Override
    public int payAmount() {
        return salary + bonus;
    }
}
