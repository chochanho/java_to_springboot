package account;

public class AccountMain {
    static void main() {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        account.Print();
    }
}
