package task2.subtask1;

public class SavingsAccount extends Account {

    private double interest;//additional attribute to previous attributes of class Account.

    public SavingsAccount(int accNum, double interest) {
        super(accNum);

        this.interest = interest;
    }

    public double getInterest() {
        return getBalance() * interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void addInterest() {
        deposit(getInterest());
    }

    public String toString() {
        return super.toString() + " Interest : " + interest;
    }

}
