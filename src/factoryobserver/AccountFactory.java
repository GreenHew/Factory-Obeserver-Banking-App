package factoryobserver;

import java.util.*;

public class AccountFactory {

	private String[] accountNames = { "CD", "Money Market", "Checking" };


	public Account createAccount(String name) {
		switch (name) {
		case "CD":
			return new CD();
		case "Money Market":
			return new MoneyMarket();
		case "Checking":
			return new Checking();
		default:
			return null;
		}
	}


	public String[] getAccountTypes() {
		return accountNames;
	}

}
