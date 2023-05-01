package bank1;

import java.util.ArrayList;
import java.util.List;

// 계좌 정보 및 계좌 거래 내역 정보
public class Account {
	private String accountNo; // 계좌번호
	private String owner; // 소유자
	private String pwd; // 패스워드
	private String launch_date; // 계좌개설일자
	
	private List<TransactionVO> transactionList = new ArrayList<>(); // 계좌별거래내역

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getLaunch_date() {
		return launch_date;
	}

	public void setLaunch_date(String launch_date) {
		this.launch_date = launch_date;
	}

	// 거래 내역 등록
	public void addTransaction(TransactionVO vo) {
		transactionList.add(vo);
	}
	
	// 거래 내역 리스트
	public List<TransactionVO> transactionList() {
		return transactionList;
	}
	
	// 마지막 거래 내역
	public TransactionVO lastTransaction() {
		if(transactionList.size() > 0) {
			return transactionList.get(transactionList.size() - 1);
		}
		
		return null;
	}
}
