package com.mycompany.bkacc;
class SavingsAccount extends BankAccount
{
    private static final double interest_rate = 0.12;
            
            
    @Override
            public void CalculateInterest()
            {
                double interest=getBalance() * interest_rate;
                System.out.println("The Interest for the Savings Account ");
                System.out.println("Interest is: "+interest);
            }
}
