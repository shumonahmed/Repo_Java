package Homework9;
/**
 * Homework:
 * 1. When opening account, customer must enter userID (Minimum 3 characters long,
 *    It cannot be one that which is already taken from userIDs list);
 * 2. User must select password which must follow following:
 *    A. Minimum 8 character long
 *    B. Alpha Numeric
 *    c. Must not contain username
 * 3. Once account is created and initial balance is set, user should be able to withdraw
 *    Money from their account: (Note: They cannot withdraw more than what they have in the account
 *    For Example: If the balance is $300, they should not be allowed to withdraw anything greater than $300)
 * 4. Set Account creation date
 * 5. User should be able to delete an account
 */

public class Bankaccount {

    private String firstName;
    private String lastName;
    private Account account;
    private String[] userIDs = {"foo", "bar", "endGame", "GOT"};
    public void Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void addAccount(double initialBalance) {
        account = new Account();
        account.setAccountId(Account.getNextId());
        account.deposit(initialBalance);
        customerDetails();
    }
    private void customerDetails() {
        account.displayAccountDetails();
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}
class Account {
    private double balance;
    private String accountId;
    private static int NEXTID = 0;
    public static final int ROUTING_NUMBER = 12345;
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void displayAccountDetails() {
        System.out.println("****** Account Information");
        System.out.println("ID: " + accountId);
        System.out.println("Balance: " + balance);
        System.out.println("Routing Number" + ROUTING_NUMBER);
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public static String getNextId() {
        return "ACCT# " + Account.NEXTID++;
    }
}
class Bank {
    public static void main(String[] args) {
        //Execute code
        Bankaccount customer = new Bankaccount();
        customer.addAccount(500);
        Bankaccount customer2 = new Bankaccount();
        customer2.addAccount(200);

        /*public class Bank {
        public static void main(String[] args) {
        //Execute code
        Customer customer = new Customer("John", "Doe");
        customer.addAccount(500);
        Customer customer2 = new Customer("Foo", "Bar");
        customer2.addAccount(200);*/
    }
}



