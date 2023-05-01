package bank1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BankImpl implements Bank {
	private  List<Account> accountList = new ArrayList<>(); // 계좌 정보
    
    // 계좌 번호 만들기
	protected String generateAccountNo() {
	    String s = "020-08-0000000";
	    if(accountList.size() > 0) {
	    	Account account = accountList.get(accountList.size() - 1);
	    	s = account.getAccountNo();
	    }
	    
	    String s1 = s.substring(0, s.lastIndexOf("-"));
	    String s2 = s.substring(s.lastIndexOf("-")+1);
			
	    int n = Integer.parseInt(s2) + 1;
			
	    s = s1 + "-" + String.format("%07d", n);
	    
	    return s;
	}
    
	@Override
    public Account addAccount(String owner, String pwd) {
		// 계좌 등록
		Calendar cal = Calendar.getInstance();
		
		String accountNo = generateAccountNo();
		String launch_date = String.format("%1$tF %1$tT", cal);
		
		Account account = new Account();
		account.setAccountNo(accountNo);
		account.setOwner(owner);
		account.setPwd(pwd);
		account.setLaunch_date(launch_date);
		
		accountList.add(account);
    	
    	return account;
    }

	@Override
    public long deposit(String accountNo, long amount) throws AccountNotFoudException{
		// 디파짓(입금)
		Account account = readAccount(accountNo);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
		
		Calendar cal = Calendar.getInstance();
		String transaction_date = String.format("%1$tF %1$tT", cal);
		
    	TransactionVO vo = new TransactionVO();
    	long balance = balance(accountNo);
   		balance += amount;
    	
    	vo.setTransaction_date(transaction_date);
    	vo.setAmount(amount);
    	vo.setBalance(balance);
    	vo.setKind("입금");
    	vo.setInfo("본인");
		
    	account.addTransaction(vo);

    	return balance;
    }

	@Override
    public long withdraw(String accountNo, String pwd, long amount) throws AccountNotFoudException, BalanceException{
		// 위드드로(출금)
		Account account = readAccount(accountNo, pwd);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}

		long balance = balance(accountNo);
		if(amount > balance) {
			throw new BalanceException("잔고가 부족합니다.");
		}
		
		Calendar cal = Calendar.getInstance();
		String transaction_date = String.format("%1$tF %1$tT", cal);
		
    	TransactionVO vo = new TransactionVO();
    	
   		balance -= amount;
    	
    	vo.setTransaction_date(transaction_date);
    	vo.setAmount(amount);
    	vo.setBalance(balance);
    	vo.setKind("출금");
    	vo.setInfo("본인");
		
    	account.addTransaction(vo);
    	
    	return balance;
    }
    
	@Override
	public long accountTransfer(String fromAccountNo, String fromPwd, String toAccountNo, long amount) throws AccountNotFoudException, BalanceException{
		// 계좌이체
		
		// 출금할 계좌
		Account fromAccount = readAccount(fromAccountNo, fromPwd);
		if(fromAccount == null) {
			throw new AccountNotFoudException("출금할 계좌는 등록된 계좌가 아닙니다.");
		}

		// 입금할 계좌
		Account toAccount = readAccount(toAccountNo);
		if(toAccount == null) {
			throw new AccountNotFoudException("입금할 계좌는 등록된 계좌가 아닙니다.");
		}
		
		// 출금할 계좌의 잔고
		long fromBalance = balance(fromAccountNo);
		if(amount > fromBalance) {
			throw new BalanceException("잔고가 부족합니다.");
		}
		fromBalance -= amount;
		
		// 입금할 계좌의 잔고
		long toBalance = balance(toAccountNo);
		toBalance += amount;
		
		// 입/출금 일자
		Calendar cal = Calendar.getInstance();
		String transaction_date = String.format("%1$tF %1$tT", cal);
		
    	TransactionVO fromVo = new TransactionVO();
    	TransactionVO toVo = new TransactionVO();
    	
    	// 출금할 계좌의 거래 내역
    	fromVo.setTransaction_date(transaction_date);
    	fromVo.setAmount(amount);
    	fromVo.setBalance(fromBalance);
    	fromVo.setKind("출금");
    	fromVo.setInfo("계좌이체");
    	fromAccount.addTransaction(fromVo);
		String name = fromAccount.getOwner();
				
    	// 입금할 계좌의 거래 내역
    	toVo.setTransaction_date(transaction_date);
    	toVo.setAmount(amount);
    	toVo.setBalance(toBalance);
    	toVo.setKind("입금");
    	toVo.setInfo(name);
    	toAccount.addTransaction(toVo);
    	
    	// 출금한 계좌의 잔액
    	return fromBalance;
    }

	@Override
    public long balance(String accountNo, String pwd) throws AccountNotFoudException {
		// 밸런스(잔액조회)
		Account account = readAccount(accountNo, pwd);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
    	
		TransactionVO vo = account.lastTransaction();
		long balance = 0L;
		if(vo != null) {
			balance = vo.getBalance();
		}
		
    	return balance;
    }

	@Override
    public long balance(String accountNo) throws AccountNotFoudException{
		// 밸런스(잔액조회)
		Account account = readAccount(accountNo);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
    	
		TransactionVO vo = account.lastTransaction();
		long balance = 0L;
		if(vo != null) {
			balance = vo.getBalance();
		}
		
    	return balance;
    }
	
	@Override
    public List<TransactionVO> transactionHistory(String accountNo, String pwd) throws AccountNotFoudException {
		// 트랜색션 히스토리(거래내역조회)
		Account account = readAccount(accountNo, pwd);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
		
    	return account.transactionList();
    }

	@Override
    public List<TransactionVO> transactionHistory(String accountNo) throws AccountNotFoudException {
		// 트랜색션 히스토리(거래내역조회)
		Account account = readAccount(accountNo);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
		
    	return account.transactionList();
    }
	
	@Override
    public Account readAccount(String accountNo) {
		// 계좌-번호검색
    	for(Account account : accountList) {
			if(account.getAccountNo().equals(accountNo)) {
				return account;
			}
		}
    	
    	return null;
    }

	@Override
    public Account readAccount(String accountNo, String pwd) {
		// 계좌-번호검색
    	for(Account account : accountList) {
			if(account.getAccountNo().equals(accountNo) && account.getPwd().equals(pwd)) {
				return account;
			}
		}
    	
    	return null;
    }
	
	@Override
    public List<Account> getAccountList(String owner) {
		// 계좌-이름검색
		List<Account> findAccount = new ArrayList<>();
		
		for(Account account : accountList) {
			if(account.getOwner().equals(owner)) {
				findAccount.add(account);
			}
		}
    	
    	return findAccount;
    }

	@Override
	public List<Account> getAccountList() {
		// 계좌-전체리스트
		return accountList;
	}
}
