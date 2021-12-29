package interfaces;
import java.lang.*;
import classes.Ticket;

public interface FlightScheduleOperations
{
	boolean insertTicket(Ticket t);
	boolean removeTicket(Ticket t);
	Ticket searchTicket(String ticketNumber);
	void showAllTickets();
}