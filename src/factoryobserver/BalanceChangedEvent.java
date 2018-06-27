package factoryobserver;

public class BalanceChangedEvent extends java.util.EventObject {
	public BalanceChangedEvent(Account source) {
		super(source);
	}


	public Account getSource() {
		return (Account) source;
	}
}