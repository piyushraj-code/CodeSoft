import java.util.Scanner;

import javax.swing.JOptionPane;

public class AtmInterface {
    static void checkBalance(int x){
        System.out.println("Your current balance is: " + x);
    }
    static int deposit(int x, int y){
        System.out.print("How much would you like to deposit?");
        
        int balance = x + y;
        System.out.println("Your new balance is: " + balance);
        return balance;
    }
    static int withdraw(int x, int y){
        int balance = x-y;
        System.out.println(y+" withdrawn from your account. Your balance amount is: "+balance);
        return balance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your initial amount:");
        int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter your initial amount:"));
        //int amount = sc.nextInt();
        while (true) {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        int choice = sc.nextInt();
        if (choice ==1) {
            checkBalance(amount);
        }
        else if(choice ==2){
            System.out.println("Enter amount to deposite:");
            int deposit = sc.nextInt();
            amount = deposit(amount, deposit);

        }
        else if(choice ==3){
            System.out.println("Enter amount to withdraw:");
            int withdraw = sc.nextInt();
            amount = withdraw(amount, withdraw);
        }
        else if(choice ==4){
            break;
        }
        else {
            System.out.println("Invalid choice");
        }
            
        }

    }
}
