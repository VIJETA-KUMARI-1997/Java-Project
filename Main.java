package ATMMachine;
import java.sql.SQLOutput;
import java.util.Scanner;



public class Main
{
    public static void main(String[] args)
    {
        Atm obj = new Atm();
        obj.checkpin();
//        System.out.println("Hello, World!");
    }
}


class Atm {
    float Balance;
    int PIN = 6543;

    public void checkpin() {
        System.out.println("Enter Your Pin");
        Scanner scn = new Scanner(System.in);
        int enteredpin = scn.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("ENTER A VALID PIN");
        }

    }

    public void menu() {
        System.out.println("ENTER A CHOICE: ");
        System.out.println("1. Check A/C Balance: ");
        System.out.println("2. Withdraw Money: ");
        System.out.println("3. Deposit Money: ");
        System.out.println("4.EXIT");

        Scanner scn = new Scanner(System.in);
        int opt = scn.nextInt();
        if (opt == 1) {
            checkBalance();

        } else if (opt == 2) {
            WithdrawMoney();

        } else if (opt == 3) {
            deposit();

        } else if (opt == 4) {
            return;
        } else {
            System.out.println("enter a valid Pin");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void deposit()
    {
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        float amounts = sc.nextFloat();
            Balance = Balance + amounts;
            System.out.println("Money Deposited Successfully");
            menu();
        }



    public void WithdrawMoney() {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner scn = new Scanner(System.in);
        float amount = scn.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println(" Money Withdrawl Successfully ");
            menu();
        }
    }
}

