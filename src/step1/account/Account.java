package step1.account;

public class Account {
    private int balance = 0;

    public void deposit(int amount){
        balance += amount;
        System.out.println(amount + "원 입금" + "\n잔고 : " + balance);
    }

    public void withdraw(int amount){
        if (balance < amount){
            System.out.println("잔액부족");
        }else {
            balance -= amount;
            System.out.println(amount + "원 출금" + "\n잔고 : " + balance);
        }

    }

    public void showBalance() {
        System.out.println("잔고 : " + balance);
    }
}
