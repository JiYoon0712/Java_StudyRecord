package bank1;

// 잔고 부족 예외
public class BalanceException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public BalanceException(String message) {
		super(message);
	}

}
