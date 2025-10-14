package org.desviante.Super.BankAccount;

public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String number, Long balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }
}
