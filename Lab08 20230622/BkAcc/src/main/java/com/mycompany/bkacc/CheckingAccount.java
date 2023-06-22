package com.mycompany.bkacc;
class CheckingAccount extends BankAccount
{
    private static final double interest_rate = 0.02;
            
            @Override
            public void CalculateInterest()
            {
                double interest=getBalance() * interest_rate;
                System.out.println("The Interest for the Checking Account ");
                System.out.println("Interest is: "+interest);
            }
}
