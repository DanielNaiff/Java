public class SavingAccount extends Account{
    private Double interestRate;

    public SavingAccount(int number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public SavingAccount(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount(){
        super();
    }

    @Override
    public void withDraw(Double amount){
        setBalance(getBalance() - amount);
    }

    public void updateBalance(){}

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
