class BankAccount{
    private String accountHolder;
    private int money;


    public int getMoney() {
        return money;
    }

    void deposit(int amount)
    {
        money +=amount;

        System.out.println(amount+"원 입금완료, 현재잔액 : "+this.money+"원");
    }

    void withdraw(int amount)
    {
        if((this.money-amount)<0){
            System.out.println("잔액부족");
            return;
        }
        this.money -=amount;

        System.out.println(amount+"원 출금완료, 현재잔액 : "+this.money+"원");
    }

    void getBalance() {
        System.out.println("현재잔액 : "+this.money + "원");
    }


    

}

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(5000);
        ba.withdraw(2000);
        ba.getBalance();

    }
}