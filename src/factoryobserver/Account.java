package factoryobserver;

import java.util.ArrayList;

public class Account {
	Double balance = 0.0;
	String type;
	private ArrayList<BalanceChangedListener> balanceChangedListeners = new ArrayList<>();


	public void deposit(Double amount) {
		balance += amount;
		fireBalanceChanged();
	}


	public Double withdraw(Double amount) {
		balance -= amount;
		fireBalanceChanged();
		return amount;
	}


	public void addBalanceChangedListener(BalanceChangedListener listener) {
		balanceChangedListeners.add(listener);
	}


	public void removeBalanceChangedListener(BalanceChangedListener listener) {
		balanceChangedListeners.remove(listener);
	}


	private void fireBalanceChanged() {
		for (BalanceChangedListener listener : balanceChangedListeners)
			listener.balanceChanged(new BalanceChangedEvent(this));
	}

}
