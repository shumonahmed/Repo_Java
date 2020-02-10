package Homework9;

/* set user attribute such as name, age, income, expenses
* 1.create a method that gets account summery which includes users name, income, expenses etc.
* 2.Create a method that gets account balance.
* 3.Create a method that sets userDetails such as name,age
* 4.Create a method that sets expenses
* 5.Create a method that sets income
* 6.Create a method that resets accounts balance which means set account to 0*/

public class newBank {

    private String name;
    private int age;
    private double income;
    private double expenses;

    public void printSummery() {
        System.out.println("name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + expenses);
    }

        public double getAccountBalance() {

            return income - expenses;
        }

        public void setDetails(String name, int age){

        this.name = name;
        this.age = age;

        }

        public void setExpense(double expense){

        this.expenses += expense;
        }

        public void setIncome(double income){

        this.income += income;

        }

        public void resetBalance() {

        income = 0;
        expenses = 0;

        }

        }




