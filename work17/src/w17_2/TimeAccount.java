package w17_2;

import w14_3.Account;

public class TimeAccount extends Account{
	private long timeBalance;
	
	public TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name,no,balance);
		this.timeBalance = timeBalance;
	}

	public long getTimeBalance() {
		return timeBalance;
	}
	
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	
}
