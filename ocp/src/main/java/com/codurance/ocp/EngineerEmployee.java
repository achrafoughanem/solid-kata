package com.codurance.ocp;

public class EngineerEmployee extends Employee {
    EngineerEmployee(int salary, int bonus) {
        super(salary, bonus);
    }

    @Override
    public int payAmount() {
        return salary;
    }
}
