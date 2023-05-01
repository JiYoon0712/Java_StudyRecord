package bank1;

import java.util.List;

public interface Bank {
    public Account addAccount(String owner, String pwd); // 계좌 등록
    public long deposit(String accountNo, long amount) throws AccountNotFoudException; // 디파짓(입금)
    public long withdraw(String accountNo, String pwd, long amount) throws AccountNotFoudException, BalanceException; // 위드드로(출금)
	public long accountTransfer(String fromAccountNo, String fromPwd, String toAccountNo, long amount) throws AccountNotFoudException, BalanceException; // 계좌이체
    public long balance(String accountNo, String pwd) throws AccountNotFoudException; // 밸런스(잔액조회)
    public long balance(String accountNo) throws AccountNotFoudException; // 밸런스(잔액조회)
    public List<TransactionVO> transactionHistory(String accountNo, String pwd) throws AccountNotFoudException; // 트랜잭색션 히스토리(거래내역조회)
    public List<TransactionVO> transactionHistory(String accountNo) throws AccountNotFoudException; // 트랜잭색션 히스토리(거래내역조회)
    
    public Account readAccount(String accountNo); // 계좌 정보
    public Account readAccount(String accountNo, String pwd); // 계좌 정보
    public List<Account> getAccountList(String owner); // 계좌-이름검색
	public List<Account> getAccountList(); // 계좌-전체리스트
}
