package sec06_user_defined_exception;

public class CheckAccount {
	private long balance; // 계좌 잔고
	private int number;   // 계좌 번호
	
	public CheckAccount(int number) { // 
		super();
		this.number = number;
	}
	
	public void deposit(long amount) { // 계좌에 돈을 입급하는 매서드
		balance += amount;
	}
	
	// 발생할 예외를 throws 했기 때문에 withdraw를 호출하는 프로그램에서 반드시 예외처리를 해주어야 함.
	public void withdraw(long amount) throws BalanceException { // 계좌에서 돈을 출금하는 매서드
		if(balance >= amount) {
			balance -= amount;
			System.out.printf("잔고에서 %d원을 출금합니다.", amount);
		} else { // 잔고가 출금액보다 낮을 경우 예외 발생시키는 구문
			System.out.printf("잔고에서 %d원을 출금합니다.\n", amount);
			throw new BalanceException(amount - balance);
		}
	}

	public long getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
}
