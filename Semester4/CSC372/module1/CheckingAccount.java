public class CheckingAccount extends BankAccount{
    private double interest;

    //Initilize the Checking Account
    public CheckingAccount(){
        interest = 0;
    }

    //Setting the Interest Rate
    public CheckingAccount(Double newInterest){
        interest = newInterest;
    }

    //Send Interest Rate as Percent
    public int displayInterest(){
        int percent = (int) Math.round(interest * 100);
        return percent;
    }

    //Allow for overdraft when Withdrawing
    @Override
    public void withdrawal(int byMoney){
        if(balance >= byMoney){
            balance -= byMoney;
            getBalance();
        }else{
            balance -= byMoney + 30;
            getBalance();
        }
    }

    //Print Account Infromation
    @Override
    public void accountSummary(){
        System.out.println(firstName + " " + lastName + ", Acount ID: " + accountID + ", Account Balance: " + balance + ", Iterest Rate: " + displayInterest() + "%");
    }
}
