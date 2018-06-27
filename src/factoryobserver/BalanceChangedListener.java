package factoryobserver;

public interface BalanceChangedListener extends java.util.EventListener {
	public void balanceChanged(BalanceChangedEvent e);
}