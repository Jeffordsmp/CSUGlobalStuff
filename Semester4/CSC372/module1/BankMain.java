public class BankMain {
    public static void main(String [] args) {
        //Setting Up two Accounts
        BankAccount bill = new BankAccount();
        CheckingAccount tom = new CheckingAccount(.07);
        bill.setInfo("Bill", "Murray", 1);
        tom.setInfo("Tom", "Hanks", 2);

        //Adding Money to the Accounts
        bill.deposit(10);
        tom.deposit(20);
        
        System.out.println("\nThis is Bill and Tom's starting accounts.");
        bill.accountSummary();
        tom.accountSummary();

        System.out.println("\nBill, will withdraw 5 dollars.");
        bill.withdrawal(5);
        System.out.println("Bills, Balance is: " + bill.getBalance());

        System.out.println("\nBill, will try to withdraw 10 more dollars.");
        bill.withdrawal(10);
        System.out.println("Bills, Balance is: " + bill.getBalance());

        System.out.println("\nTom, will withdraw 10 dollars.");
        tom.withdrawal(10);
        System.out.println("Tom's, Balance is: " + tom.getBalance());

        System.out.println("\nTom, will try to withdraw 11 more dollars.");
        tom.withdrawal(11);
        System.out.println("Tom's, Balance is: " + tom.getBalance());

        System.out.println("\nThis is Bill and Tom's final accounts.");
        bill.accountSummary();
        tom.accountSummary();
    } 
}
