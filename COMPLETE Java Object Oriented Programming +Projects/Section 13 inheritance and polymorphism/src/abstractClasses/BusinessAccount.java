package abstractClasses;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        setBalance(getBalance() - 2);
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            setBalance(getBalance() +amount - 10);
        }
    }

    public BusinessAccount(){
        super();
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
