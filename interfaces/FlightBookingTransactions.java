package interfaces;

import java.lang.*;

public interface FlightBookingTransactions
{
	boolean depositMoney(double amount);
	boolean withdrawMoney(double amount);
}