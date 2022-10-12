package sec06_user_defined_exception;

public class BalanceException extends Exception{
	private long amount; // 모자란 금액 저장
	
	public BalanceException(){}

	public BalanceException(long amount) {
		super("잔액이 " + amount + "원 부족합니다.");
		this.amount = amount;
	}	
}
