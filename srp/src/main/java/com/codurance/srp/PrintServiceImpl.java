package com.codurance.srp;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Collectors.toCollection;


public class PrintServiceImpl implements PrintService {
    private static final String STATEMENT_HEADER = "DATE | AMOUNT | BALANCE";
    private final ConsoleService consoleService;
    private final TransactionRepository transactionRepository;
    private final FormatingService formatingService;

    public PrintServiceImpl(ConsoleService consoleService, TransactionRepository transactionRepository, FormatingService formatingService) {
        this.consoleService = consoleService;
        this.transactionRepository = transactionRepository;
        this.formatingService = formatingService;
    }

    @Override
    public void printTransactions() {
        List<Transaction> transactions = transactionRepository.all();
        final AtomicInteger balance = new AtomicInteger(0);
        transactions.stream()
                .map(transaction -> formatingService.statementLine(transaction, balance.addAndGet(transaction.amount())))
                .collect(toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(s->consoleService.printLine(s.toString()));

    }

    @Override
    public void printHeader() {
        consoleService.printLine(STATEMENT_HEADER);

    }

    @Override
    public void printStatement() {
        printHeader();
        printTransactions();
    }
}
