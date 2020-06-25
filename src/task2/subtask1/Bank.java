package task2.subtask1;



public class Bank {


    public void openAccount(int accountNumber, Account type) {

    }

    public void closeAccount() {

    }

    public static void main(String [] args) {

        SavingsAccount savingsAccount = new SavingsAccount(12345,0.2);
        savingsAccount.deposit(3000);
        savingsAccount.addInterest();
        savingsAccount.print();

        CurrentAccount currentAccount = new CurrentAccount(12346,10000.0);
        currentAccount.deposit(2000);
        currentAccount.withdraw(500000);
        currentAccount.print();


    }
}
