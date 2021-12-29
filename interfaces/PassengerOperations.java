package interfaces;
import java.lang.*;
import classes.Passenger;

public interface PassengerOperations
{
	boolean insertPassenger(Passenger p);
	boolean removePassenger(Passenger p);
	Passenger searchPassenger(String nationalId);
	void showAllPassengers();

}