package account;

public class Account {
    int balance = 0 ;
    void deposit(int amount){
        balance += amount;
    }
    void withdraw(int amount){
        int a = balance - amount;
        if(a>=0){
            balance = a;

        }else{
            System.out.println("잔액 부족");
        }
    }

    void Print(){
        System.out.println("잔고: "+ balance);
    }
}
