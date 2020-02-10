package Homework9;

public class newBankApp {

    public static void main(String[] args) {

        newBank user = new newBank();
        //user.printSummery();
        //System.out.println(user.getAccountBalance());
        user.setDetails("Shumon",43);
        //user.printSummery();
        user.setIncome(200);
        user.setIncome(500);
        user.setExpense(10);
        user.setExpense(3);
        user.printSummery();
        //System.out.println("Balance: " + (user.getAccountBalance()));
        user.resetBalance();
        user.printSummery();
    }
}
