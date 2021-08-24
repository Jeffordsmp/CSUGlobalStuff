public class BankAccount {
    public String firstName;
    public String lastName;
    public int accountID;
    public double balance;

    //Initilizeing the Account
    public BankAccount(){
        firstName = "";
        lastName = "";
        accountID = 0;
        balance = 0;
    }

    //Setting the information of the Account
    public void setInfo(String newFirstName, String newLastName, int newAccountId){
        firstName = newFirstName;
        lastName = newLastName;
        accountID = newAccountId;
    }

    //Add Funds to the Account
    public void deposit(int helloMoney){
        balance += helloMoney;
        getBalance();
    }

    //Remove Funds from the Account
    public void withdrawal(int byMoney){
        if(balance >= byMoney){
            balance -= byMoney;
            getBalance();
        }else{
            System.out.println("You do not Have Sufficient Funds");
        }
    }

    //Send the total Balance
    public double getBalance(){
        return balance;
    }

    //Print the account infromation
    public void accountSummary(){
        System.out.println(firstName + " " + lastName + ", Acount ID: " + accountID + ", Account Balance: " + balance);
    }
}
