package task2.subtask1;

public class Account {
        private double balance; // The current balance
        private int accNum; // The account number

        public Account (int num)
        {
            balance = 0.0;
            accNum = num;
        }

        public void deposit (double amount)
        {
            if (amount>0)
                balance += amount;
            else
                System.out.println("Can not deposit negative amount!");
            // add the amount to the balance only if positive
        }

        public void withdraw (double amount)
        {
            if (amount > 0)
                balance -= amount;
            else
                System.out.println("Can not withdraw negative amount!");
        }

        public double getBalance()
        {
            return balance; //returns the balance
        }

        public int getAccountNumber()
        {
            return accNum; //returns the account number
        }

        @Override
        public String toString()
        {
            return "Account number is " + accNum + " the balance is " + balance + ".";
        }

        public final void print()
        {
            //Don't override this, override the toString method above
            System.out.println( toString());
        }

}
