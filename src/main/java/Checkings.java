/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jalen
 */
public class Checkings extends Accounts{
    private double checkings_balance = 0.00;

    public Checkings(double checkings_balance, int age, int account_id, String first_name, String last_name, String city, String state, double balance) {
        super(age, account_id, first_name, last_name, city, state, balance);
        this.checkings_balance = checkings_balance;
    }
    

    
    @Override
    public double checkBalance(){
        return checkings_balance;
    }
    
    public double getCheckings_balance() {
        return checkings_balance;
    }

    public void setCheckings_balance(double checkings_balance) {
        this.checkings_balance = checkings_balance;
    }

    @Override
    public String toString() {
        return "Checkings{" + "checkings_balance=" + checkings_balance + '}';
    }
}
