package com.codurance.ocp;

public abstract class Employee {

    protected int salary;
    protected int bonus;

    Employee(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public abstract int payAmount();
//    {
//        switch (this.type) {
//            case ENGINEER:
//                return salary;
//            case MANAGER:
//                return salary + bonus;
//            default:
//                return 0;
//        }
//    }

}