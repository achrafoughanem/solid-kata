package com.codurance.srp;

import java.time.LocalDate;

public interface FormatingService {

    String statementLine(Transaction transaction, int balance);
    String formatDate(LocalDate date);
    String formatNumber(int amount);

}
