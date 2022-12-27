
import java.util.*;

/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

/**
*
* @author jalen
*/
public class Main {
    public static void main(String [] args) throws InterruptedException{

    activateAccount();        
    }

         /**
          * activeAccount will be used to create the main logic for this application
          * 
          * @throws InterruptedException 
          */
        public static void activateAccount() throws InterruptedException{
        
        // Welcome message
        System.out.println("Welcome to your account registration! Start by entering the following information: ");
        Thread.sleep(2000);
        
        // Initiating a object from the checkings class that extends accounts
        Checkings a1  = new Checkings(0.00,0, 0, "null", "null", "null", "nullC", 0.00);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your first name:");
        String first_name = myObj.nextLine();  // Read user input
        a1.setFirst_name(first_name);

        System.out.println("Enter your last name:");
        String last_name = myObj.nextLine();  // Read user input
        a1.setLast_name(last_name);

        System.out.println("Enter your current city:");
        String city = myObj.nextLine();  // Read user input
        a1.setCity(city);

        System.out.println("Enter your current state:");
        String state = myObj.nextLine();  // Read user input
        a1.setState(state);

        System.out.println("Welcome " + a1.getFirst_name() + " " + a1.getLast_name() + "!");  // Output user input
        Thread.sleep(2000);

        System.out.println("Enter your age:");
        
        // Initiating a try/catch block to catch any exception
        try{
            int age = myObj.nextInt(); // Read user input        
            a1.setAge(age);

            System.out.println("Your account id is: 100210"); // New user will have this set ID for now
            a1.setAccount_id(100210);
            Thread.sleep(2000);
            System.out.println("In order to complete your account initialization, you must deposit an initial amount of funds.");
            Thread.sleep(2000);

            System.out.println("Please enter an initial amount. For example if you wish to deposit $200.53, enter 200.53:");
            double amount = myObj.nextDouble();
            a1.deposit(amount);
            a1.setBalance(amount);

            Thread.sleep(2000);

            System.out.println("Thank you " + a1.getFirst_name() + ". You have a current balance of $" + a1.getBalance() + ".");

            // Initializing a menu with options
            char selection = '\0';
            a1.setCheckings_balance(0.00);

            System.out.println("Choose an option from the menu.");
            System.out.println();
            System.out.println("A. View account info");
            System.out.println("B. View account balance");
            System.out.println("C. Make a deposit");
            System.out.println("D. Withdraw funds");
            System.out.println("E. View your checking funds");
            System.out.println("F. Trasfer funds to checkings");
            System.out.println("G. Exit menu");
            
            // using a do/while loop for the menu
            do {
                System.out.println("Choose an option from the menu."); 
                char selection1 = myObj.next().charAt(0);
                selection = Character.toUpperCase(selection1);
                System.out.println();

                switch(selection){
                    
                    // Displays account information
                    case 'A':
                    System.out.println("Name: " + a1.getFirst_name() + " " + a1.getLast_name());
                    System.out.println("Age: " + a1.getAge());
                    System.out.println("Location: " + a1.getCity() + ", " + a1.getState());
                    System.out.println("Current balance: $" + a1.getBalance());
                    System.out.println("Current checkings balance: $" + a1.getCheckings_balance());
                    break;
                    
                    // Retrieve account balance
                    case 'B':
                    System.out.println("Current balance: $" + a1.getBalance());
                    break;
                    
                    // Logic to deposit funds
                    case 'C':
                    System.out.println("Please enter an amount. For example if you wish to deposit $200.53, enter 200.53:");
                    amount = myObj.nextDouble();
                    a1.deposit(amount);
                    break;
                    
                    // Logic to withdraw funds
                    case 'D':
                    System.out.println("Please enter an amount. For example if you wish to WITHDRAW $21.00, enter 21.00:");
                    amount = myObj.nextDouble();
                    a1.withdraw(amount);
                    break;
                    
                    // Retrieve checkings balance
                    case 'E':
                    System.out.println("Current balance: $" + a1.getCheckings_balance());
                    break; 
                    
                    // Logic to transfer funds from balance to checkings balance
                    case 'F':
                    System.out.println("Please enter an amount. For example if you wish to TRANSFER $21.00, enter 21.00:");
                    
                    double transfer_amount = myObj.nextDouble();
                    
                    if (transfer_amount > a1.getBalance()){
                        System.out.println("WARNING: Insufficent funds");                       
                    } 
                    else {                         
                        double updated_balance = a1.getBalance() - transfer_amount;
                        a1.setBalance(updated_balance);         

                        double updated_checkings_balance = a1.getCheckings_balance() + transfer_amount;
                        a1.setCheckings_balance(updated_checkings_balance);                   
                    }                   
                    break;
                    
                    //Exits application(loop)
                    case 'G':
                    System.out.println("");
                    break;
                    
                    default:
                    System.out.println("Please enter a valid menu option");
                    break;

                }
            } while(selection != 'G');
            System.out.println("You have now exited the application. Thank you for banking with us!");  
        }
        catch(InputMismatchException a){
            System.err.println("ERROR: Not a valid input. Restart the application"); 

        }        
    }
}


