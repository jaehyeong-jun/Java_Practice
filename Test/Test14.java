//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class BankAccount
{
    private String accountHolder; //예금주
    private double balance; //잔액

    public void deposit(double amount) {
        balance += amount;
        System.out.print(amount + "원 입금완료,  ");
        getBalance();
    }
    public void withdraw(double amount) {
        if(balance - amount < 0){
            System.out.println("출금양이 예금잔액도 많아서 프로그램을 종료합니다.");
            System.exit(-1);
        }

        balance -= amount;
        System.out.print(amount + "원 출금완료,  ");
        getBalance();
    }
    public void getBalance() {
        System.out.println("현재잔액 : " + this.balance+"원");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(5000);
        ba.withdraw(7000);
        ba.getBalance();
    }
}