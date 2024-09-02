package project1;

import java.util.Scanner;

class ATM{
    float Balance;
    int pin=345;
    public void checkpin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your pin");
        int Enterpin=sc.nextInt();
        if(Enterpin==pin){
            menu();
        }
        else{
            System.out.println(" please Enter valid pin");
        }
        checkpin();
}
    
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1 : chech a/c balance");
        System.out.println("2 : withdrow money");
        System.out.println("3 : deposit money");
        System.out.println("4 : exit");
         
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrowMoney();
        }
        else if(opt==3){
            depositMoney();
        }
        else if(opt==4){
            return;

        }
        else{
            System.out.println("Enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance"+Balance);
        menu();
    }
    public void withdrowMoney(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("moner withdrow successful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the amount");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money deposit is successful");
    menu();
    }
}
public class ATMmachine {
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkpin();
    }
}
