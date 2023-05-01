package bank1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.List;

// 화면 입출력
public class BankUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Bank bank = new BankImpl();
	
	public void menu() {
		int ch;
		
		while(true) {
			try {
				System.out.println("-----------------------------------------------------");
				System.out.println("1.계좌개설  2.입금  3.출금  4.계좌이체  5.잔액조회  6.거래내역");
				System.out.println("7.계좌번호검색(은행)  8.이름검색(은행)  9.계좌리스트(은행)  10.종료");
				System.out.println("-----------------------------------------------------");
				System.out.print("선택=> ");
				
				ch = Integer.parseInt(br.readLine());

				if(ch==10) {
					return;
				}

				switch(ch) {
				case 1:addAccount(); break;
				case 2:deposit(); break;
				case 3:withdraw(); break;
				case 4:accountTransfer(); break;
				case 5:balance(); break;
				case 6:transactionHistory(); break;
				case 7:findByAccountNo(); break;
				case 8:findByOwner(); break;
				case 9:accountList(); break;
				}
			} catch (Exception e) {
			}
		}
	}
	
	public void addAccount() {
		System.out.println("\n[개인-계좌 개설]");
		
		String owner, pwd;
		
		try {
			System.out.print("이름 ? ");
			owner = br.readLine();
			
			System.out.print("패스워드 ? ");
			pwd = br.readLine();
			
			Account account = bank.addAccount(owner, pwd);
			
			System.out.println("개설계좌번호 : " + account.getAccountNo());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
	}

	public void deposit() {
		System.out.println("\n[개인-입금]");
		
		String accountNo;
		long amount;
		
		try {
			System.out.print("입금 계좌 번호 ? ");
			accountNo = br.readLine();
			
			System.out.print("입금액 ? ");
			amount = Long.parseLong(br.readLine());
			
			long balance = bank.deposit(accountNo, amount);
			
			System.out.println("입금후 잔액 : " + balance);
			
		} catch (NumberFormatException e) {
			System.out.println("금액은 숫자만 가능합니다.");
		} catch (AccountNotFoudException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	public void withdraw() {
		System.out.println("\n[개인-출금]");
		
		String accountNo, pwd;
		long amount;
		
		try {
			System.out.print("출금 계좌 번호 ? ");
			accountNo = br.readLine();

			System.out.print("패스워드 ? ");
			pwd = br.readLine();
			
			System.out.print("출금액 ? ");
			amount = Long.parseLong(br.readLine());
			
			long balance = bank.withdraw(accountNo, pwd, amount);
			
			System.out.println("출금후 잔액 : " + balance);
			
		} catch (NumberFormatException e) {
			System.out.println("금액은 숫자만 가능합니다.");
		} catch (AccountNotFoudException e) {
			System.out.println(e.getMessage());
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();

	}

	public void accountTransfer() {
		System.out.println("\n[개인-계좌이체]");
		
		String fromAccountNo, fromPwd, toAccountNo;
		long amount;
		
		try {
			System.out.print("출금할 계좌 번호 ? ");
			fromAccountNo = br.readLine();

			System.out.print("패스워드 ? ");
			fromPwd = br.readLine();
			
			System.out.print("출금액 ? ");
			amount = Long.parseLong(br.readLine());
			
			System.out.print("입금할 계좌 번호 ? ");
			toAccountNo = br.readLine();
			
			long balance = bank.accountTransfer(fromAccountNo, fromPwd, toAccountNo, amount);
			
			System.out.println("출금(계좌이체)후 잔액 : " + balance);
			
		} catch (NumberFormatException e) {
			System.out.println("금액은 숫자만 가능합니다.");
		} catch (AccountNotFoudException e) {
			System.out.println(e.getMessage());
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
	}

	public void balance() {
		System.out.println("\n[개인-잔액조회]");
		
		String accountNo, pwd;
		long amount;
		
		try {
			System.out.print("조회할 계좌 번호 ? ");
			accountNo = br.readLine();
			
			System.out.print("패스워드 ? ");
			pwd = br.readLine();
			
			amount = bank.balance(accountNo, pwd);
			
			System.out.print("계좌번호:" + accountNo+"\t");
			System.out.println("잔액:" + amount);
			
		} catch (AccountNotFoudException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	public void transactionHistory() {
		System.out.println("\n[개인-거래내역조회]");

		String accountNo, pwd;
		
		try {
			System.out.print("조회 할 계좌 번호 ? ");
			accountNo = br.readLine();
			
			System.out.print("패스워드 ? ");
			pwd = br.readLine();

			List<TransactionVO> historys = bank.transactionHistory(accountNo, pwd);
			
			String s;
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			
			System.out.println("거래일자\t\t\t구분\t금액\t잔고\t내역");
			for(TransactionVO vo : historys) {
				System.out.print(vo.getTransaction_date()+"\t");
				System.out.print(vo.getKind()+"\t");
				s = nf.format(vo.getAmount());
				System.out.print(s+"\t");
				s = nf.format(vo.getBalance());
				System.out.print(s+"\t");
				System.out.println(vo.getInfo());
			}
		} catch (AccountNotFoudException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();
	}
	
	public void findByAccountNo() {
		System.out.println("\n[은행-계좌번호조회]");
		
		String accountNo;
		
		try {
			System.out.print("조회 할 계좌 번호 ? ");
			accountNo = br.readLine();
			
			Account account = bank.readAccount(accountNo);
			if(account == null) {
				System.out.println("등록된 계좌가 아닙니다.\n");
				return;
			}
			
			long balance = bank.balance(account.getAccountNo());
			
			System.out.print(account.getAccountNo() + "\t");
			System.out.print(account.getOwner() + "\t");
			System.out.print(account.getLaunch_date() + "\t");
			System.out.println(balance);
		} catch (AccountNotFoudException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	public void findByOwner() {
		System.out.println("\n[은행-이름검색]");
		
		String name;
		
		try {
			System.out.print("조회 할 이름 ? ");
			name = br.readLine();
			
			System.out.println("계좌번호\t\t이름\t개설일자\t\t\t잔고");
			
			List<Account> findAccounts = bank.getAccountList(name);
			for(Account account : findAccounts) {
				if(account == null) {
					break;
				}

				long balance = bank.balance(account.getAccountNo());
				
				System.out.print(account.getAccountNo() + "\t");
				System.out.print(account.getOwner() + "\t");
				System.out.print(account.getLaunch_date() + "\t");
				System.out.println(balance);
			}
			
		} catch (AccountNotFoudException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();
	}

	public void accountList() {
		System.out.println("\n[은행-계좌전체리스트]");

		try {
			
			List<Account> accountList = bank.getAccountList();
			
			System.out.println("계좌번호\t\t이름\t개설일자\t\t\t잔고");
			for(Account account : accountList) {
				long balance = bank.balance(account.getAccountNo());
				
				System.out.print(account.getAccountNo() + "\t");
				System.out.print(account.getOwner() + "\t");
				System.out.print(account.getLaunch_date() + "\t");
				System.out.println(balance);
			}
			
		} catch (AccountNotFoudException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}
}
