package com.codurance.srp;

public class ConsoleServiceImpl implements ConsoleService {

    private final Console console;

    public ConsoleServiceImpl(Console console) {
        this.console = console;
    }

    @Override
    public void printLine(String line) {
        console.printLine(line);
    }
}
