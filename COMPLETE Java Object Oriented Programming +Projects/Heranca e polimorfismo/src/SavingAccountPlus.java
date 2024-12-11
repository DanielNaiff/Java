public class SavingAccountPlus extends SavingAccount {
    @Override
    public void withDraw(Double amount){
        setBalance(getBalance() - amount);
    }
}
