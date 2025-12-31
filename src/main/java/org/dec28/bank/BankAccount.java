package org.dec28.bank;

public class BankAccount {
    public static void main(String[] args){
        bankRules();
        BankAccount userA = new BankAccount(4545,"Ankur",10);
        BankAccount userB = new BankAccount(4546,"Rohit",10);
        System.out.println("Account number"+ userA.getAccountNo());
        System.out.println(userA.balanceCheck(4545));
        userA.deposit(4545,10);
        System.out.println("Balance after deposit "+userA.balanceCheck(4545));
        userA.withdraw(4545,50);
        System.out.println("Updated balance after withdrawal"+ userA.balanceCheck(4545));
    }
    private int accountNo;
    private String name;
    private int balance;

    static void bankRules(){
        System.out.println("Please ensure that you enter the correct account number");
    }
    public BankAccount(int accountNo, String name, int balance){
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public int balanceCheck(int accountNo){
        if(this.accountNo == accountNo){
            return balance;
        }
        else{
            return 0;
        }
    }
    public void deposit(int accountNo,int amount){
        if(this.accountNo == accountNo){
            if(amount<0){
                throw new IllegalArgumentException("Amount must be greater than 0");
            }
            balance+=amount;
        }
    }

    public void withdraw(int accountNo, int amount){
        if(balance<amount){
            throw new IllegalArgumentException("AMount should be less then the available balance");
        }
        balance-=amount;
    }
}
