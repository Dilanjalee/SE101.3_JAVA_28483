package com.mycompany.bkacc;
public class BkAcc
{

    public static void main(String[] args)
    {
        //TODO Code application logic here
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setBalance(2000000.00);
        savingsAccount.CalculateInterest();
        
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setBalance(2000000.00);
        checkingAccount.CalculateInterest();
    }
}
