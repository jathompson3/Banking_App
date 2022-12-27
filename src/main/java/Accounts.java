
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jalen
 */
public class Accounts {
    private int age = 0;
    private int account_id = 0;
    private String first_name = " ";
    private String last_name = " ";
    private String city = " ";
    private String state = " ";
    private double balance = 0;
    
    public Accounts(int age,int account_id, String first_name, String last_name, String city, String state, double balance) {
        this.age = age;
        this.account_id = account_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.city = city;
        this.state = state;
        this.balance = balance;
    }

    
    public void deposit(double amount){
        if (amount >= 0){
            balance = balance + amount;
        }
        else
            System.out.println("Enter a valid amount");        
    }
    
    public void withdraw(double amount){
        if (amount >= 0){
            balance = balance - amount;
        }
        else
            System.out.println("Enter a valid amount");        
    }
    
    public double checkBalance(){
        return balance;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
            
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Accounts{" + "age=" + age + ", account_id=" + account_id + ", first_name=" + first_name + ", last_name=" + last_name + ", city=" + city + ", state=" + state + ", balance=" + balance + '}';
    }
}
