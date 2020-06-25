package task2.subtask1;

public class CurrentAccount extends Account {

    private double limit;// additional variable to know limit of overdraft

    public CurrentAccount(int accnum, double limit) {
        super(accnum);
        this.limit = limit;
    }

    public double getLimit() {
        return this.limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void withdraw(double amount) {
        if (amount <= this.limit)
            super.withdraw(amount);
        else {
            System.out.println(" Sorry, Limit Exceeded");
        }
    }

    public String toString() {
        return super.toString() + " Limit : " + limit;

    }
}


