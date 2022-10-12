package sec06_user_defined_exception;

public class AccountTest {

	public static void main(String[] args) {
		CheckAccount account = new CheckAccount(1234); // CheckAccout클래스의 객체 account를 생성
		
		account.deposit(10000); // deposit매서드를 이용해 잔고에 10000원 입금
		System.out.println(account.getBalance());
		
		try {
			account.withdraw(12000); // withdraw매서드를 이용해 잔고에서 12000원 출금
		} catch (BalanceException e) {
			System.out.println("잔고에 금액이 부족합니다.");
			System.out.println(e.getMessage());
		}
	}

}
