package classes;

import java.lang.*;
import interfaces.FlightBookingTransactions;

public abstract class Ticket implements FlightBookingTransactions
{	
	private String ticketNumber;
	private double payment;
	private Passenger passenger;

	public Ticket(){ }
	public Ticket(String ticketNumber , Passenger passenger , double payment )
	{
		this.ticketNumber = ticketNumber;
		this.passenger = passenger;
		this.payment = payment;
	}
	
	public void setTicketNumber(String ticketNumber){ this.ticketNumber = ticketNumber; }
	public void setPassenger(Passenger passenger){	this.passenger = passenger;}
	public void setPayment(double payment){	this.payment = payment;	}
	
	public String getTicketNumber(){ return ticketNumber;}
	public Passenger getPassenger(){ return passenger;}
	public double getPayment(){	return payment;}
	
	public abstract void showDetails();
	
	public boolean depositMoney(double amount)
	{
		if(amount>0)
		{
			payment = payment + amount;
			return true;
		}
		return false;
	}
	public boolean withdrawMoney(double amount)
	{
		if(amount>0 && amount<= payment)
		{
			payment = payment - amount;
			return true;
		}
		return false;
	}
}