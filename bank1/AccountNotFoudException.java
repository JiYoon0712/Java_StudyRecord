package bank1;

// 계좌가 존재하지 않는 경우 발생하는 예외
public class AccountNotFoudException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public AccountNotFoudException(String message) {
		super(message);
	}
}
