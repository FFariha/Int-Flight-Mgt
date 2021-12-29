import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Airlines a = new Airlines();
		a.setName("Continental Airlines");
		a.setBranchName("Uttara");
		
		System.out.println("------------------------------------");
		System.out.println("Welcome to Continental Airlines ");
		System.out.println("------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?\n");
		
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Passenger Management");
			System.out.println("\t3. Ticket Management");
			System.out.println("\t4. Flight Booking Transactions");
			System.out.println("\t5. Show Airline Information");
			System.out.println("\t6. Exit");
			
			System.out.println("\n---------------------------");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println("---------------------------\n");
			
			switch(choice)
			{
				case 1:
					
					System.out.println("--------------------------------------");
					System.out.println("Employee Management Selected");
					System.out.println("--------------------------------------");
				
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Employee");
					System.out.println("\t3. Search Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option1)
					{
						case 1:
							
							System.out.println("-------------------------------------");
							System.out.println("You have selected Insert Employee");
							System.out.println("-------------------------------------");
							
							break;
							
						case 2:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Remove Employee");
							System.out.println("--------------------------------------");
							break;
							
						case 3:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Search Employee");
							System.out.println("--------------------------------------");
							break;
							
						case 4:
						
							System.out.println("--------------------------------------");
							System.out.println("You have selected Show All Employees");
							System.out.println("--------------------------------------");
							break;
							
						case 5:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected to Go Back....");
							System.out.println("--------------------------------------");
							
							break;
							
						default:
							
							System.out.println("--------------------------------------");
							System.out.println("Invalid Option... Going Back...");
							System.out.println("--------------------------------------");
							break;
					}
					break;
					
				case 2:
					
					System.out.println("--------------------------------------");
					System.out.println("You have selected Passenger Management");
					System.out.println("--------------------------------------");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Passenger");
					System.out.println("\t2. Remove Passenger");
					System.out.println("\t3. Search Passenger");
					System.out.println("\t4. Show All Passengers");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option2)
					{
						case 1:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Insert Passenger");
							System.out.println("--------------------------------------");
							
							System.out.print("Enter Passenger's NID Number : ");
							String nationalId1 = sc.next();
							System.out.print("Enter Passenger's Passport Number: ");
							String passportNumber1 = sc.next();
							System.out.print("Enter Passenger's Name: ");
							String name1 = sc.next();
							System.out.print("Enter Customer Phone Number: ");
							String phoneNumber1 = sc.next();
							
							Passenger p1 = new Passenger();
							p1.setNationalId(nationalId1);
							p1.setPassportNumber(passportNumber1);
							p1.setName(name1);
							p1.setPhoneNumber(phoneNumber1);
							
							if(a.insertPassenger(p1))
							{
								System.out.println("***  Passenger Inserted, NID : " + p1.getNationalId() + "  ***");
							}
							else
							{
								System.out.println("***  Passenger NOT Inserted, NID : " + p1.getNationalId() + "  ***");
							}
								
							break;
							
						case 2:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Remove Passenger ");
							System.out.println("--------------------------------------");
							
							System.out.print("Enter the NID to remove a Passenger: ");
							String nationalId2 = sc.next();
							
							Passenger p2 = a.searchPassenger(nationalId2);
							
							if(p2 != null)
							{
								System.out.println("***  Passenger Found  ***");
								
								if(a.removePassenger(p2))
								{
									System.out.println("***  Passenger Removed, NID : " + p2.getNationalId() + "  ***");
								}
							}
							else
							{
								System.out.println("***  Passenger NOT Found and NOT Removed  ***");
							}
								
							break;
							
						case 3:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Search Passenger");
							System.out.println("--------------------------------------");
							
							System.out.print("Enter the NID to search a Passenger: ");
							String nationalId3 = sc.next();
							
							Passenger p3 = a.searchPassenger(nationalId3);
							
							if(p3 != null)
							{
								System.out.println("***  Passenger Found  ***");
								p3.showDetails();
							}
							else
							{
								System.out.println("***  Passenger NOT Found  ***");
							}
							
							break;
							
						case 4:
						
							System.out.println("--------------------------------------");
							System.out.println("You have selected Show All Passengers");
							System.out.println("--------------------------------------");
							
							a.showAllPassengers();
							
							break;
							
						case 5:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected to Go Back....");
							System.out.println("--------------------------------------");
							
							break;
							
						default:
							
							System.out.println("--------------------------------------");
							System.out.println("Invalid Option... Going Back...");
							System.out.println("--------------------------------------");
							break;
					}
					
					break;
					
				case 3:
					
					System.out.println("--------------------------------------");
					System.out.println("You have selected Ticket Management");
					System.out.println("--------------------------------------");
				
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Account");
					System.out.println("\t2. Remove Account");
					System.out.println("\t3. Search Account");
					System.out.println("\t4. Show All Accounts");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option3)
					{
						case 1:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Insert New Ticket");
							System.out.println("--------------------------------------");
							
							
							System.out.print("Enter the NID to verify a Passenger: ");
							String nationalId1 = sc.next();
							
							Passenger p1 = a.searchPassenger(nationalId1);
							
							if(p1 != null)
							{
								System.out.println("***  Passenger Verified  ***");
								
								Ticket t = null;
								
								System.out.println("There are Two types of Ticket. Which one do you want to Buy ??? ");
								System.out.println("\t1. Business Class Ticket ");
								System.out.println("\t2. Economy Class Ticket ");
								System.out.println("\t3. Go Back");
								
								System.out.println("\n---------------------------");
								System.out.print("Enter your Type: ");
								int type = sc.nextInt();
								System.out.println("---------------------------\n");
								
								if(type == 1)
								{
									System.out.print("Enter Ticket Number: ");
									String tn = sc.next();
									System.out.print("Enter Ticket Payment: ");
									double pa = sc.nextDouble();
									System.out.print("Enter Business Class Rate: ");
									double br = sc.nextDouble();
									
									BusinessClass bc = new BusinessClass(tn, p1, pa, br);
									t = bc;
									
								}
								else if(type == 2)
								{
									System.out.print("Enter Ticket Number: ");
									String tn = sc.next();
									System.out.print("Enter Ticket Payment: ");
									double pa = sc.nextDouble();
									System.out.print("Enter Economy Class rate: ");
									double er = sc.nextDouble();
									
									EconomyClass ec = new EconomyClass(tn, p1, pa, er);
									
									t = ec;
								}
								else if(type == 3)
								{
									System.out.println("--------------------------------------");
									System.out.println("You have selected to Go Back....");
									System.out.println("--------------------------------------");
								}
								else
								{									
									System.out.println("--------------------------------------");
									System.out.println("Invalid Option... Going Back...");
									System.out.println("--------------------------------------");
								}
								
								if(t!= null)
								{
									if(a.insertTicket(t))
									{
										System.out.println("***  Ticket Inserted, Ticket Number: " + t.getTicketNumber() + "  ***");
									}
									else
									{
										System.out.println("***  Ticket Inserted, Ticket Number: " + t.getTicketNumber() + "  ***");
									}
								}	
							}
							else
							{
								System.out.println("***  Invalid Passenger... Can NOT Buy or Book any Ticket   ***");
							}
							
							
							break;
							
						case 2:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Remove Ticket");
							System.out.println("--------------------------------------");
							
							
							
							
							
							break;
							
						case 3:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Search Ticket");
							System.out.println("--------------------------------------");
							
							
							
							
							
							break;
							
						case 4:
						
							System.out.println("--------------------------------------");
							System.out.println("You have selected Show All Tickets");
							System.out.println("--------------------------------------");
							
							a.showAllTickets();
							
							break;
							
						case 5:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected to Go Back....");
							System.out.println("--------------------------------------");
							
							break;
							
						default:
							
							System.out.println("--------------------------------------");
							System.out.println("Invalid Option... Going Back...");
							System.out.println("--------------------------------------");
							break;
					}
					
					
					break;
					
				case 4:
					
					System.out.println("------------------------------------------------");
					System.out.println("You have selected Flight Booking Transaction Management");
					System.out.println("------------------------------------------------");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Deposit Payment");
					System.out.println("\t2. Withdraw Payment");
					System.out.println("\t3. Transaction History");
					System.out.println("\t4. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option4)
					{
						case 1:
							
							System.out.println("-------------------------------------");
							System.out.println("You have selected Deposit Payment");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter Ticket Number for Verification: ");
							String tn1 = sc.next();
							
							Ticket t1 = a.searchTicket(tn1);
							
							if(t1 != null)
							{
								System.out.println("*** Ticket Verified  ***");
								System.out.println("Ticket Number: " + t1.getTicketNumber());
								System.out.println("Ticket Holder Name: " + t1.getPassenger().getName());
								
								System.out.println("Current Payment: " + t1.getPayment());
								System.out.print("Deposit Payment: ");
								double am = sc.nextDouble();
								
								if(t1.depositMoney(am))
								{
									System.out.println("--- Deposit Payment Successfull ---");
									System.out.println("New Payment: " + t1.getPayment());
									frwd.writeInFile(am + " Deposited Money in " + t1.getTicketNumber());
								}
								else
								{
									System.out.println("--- Deposit payment Failed ---");
								}
							}
							else
							{
								System.out.println("***  Invalid Ticket... Can NOT Deposit Money   ***");
							}
							
							
							break;
							
						case 2:
							
							System.out.println("-------------------------------------");
							System.out.println("You have selected Withdraw Money");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter Account Number for Verification: ");
							String tn2 = sc.next();
							
							Ticket t2 = a.searchTicket(tn2);
							
							if(t2 != null)
							{
								System.out.println("*** Ticket Verified  ***");
								System.out.println("Ticket Number: " + t2.getTicketNumber());
								System.out.println("Ticket Holder Name: " + t2.getPassenger().getName());
								
								System.out.println("Current Payment: " + t2.getPayment());
								System.out.print("Withdraw Amount: ");
								double am = sc.nextDouble();
								
								if(t2.withdrawMoney(am))
								{
									System.out.println("--- Withdraw Successfull ---");
									System.out.println("New Ticket Payment : " + t2.getPayment());
									frwd.writeInFile(am + " Withdrawn Ticket payment " + t2.getTicketNumber());
								}
								else
								{
									System.out.println("--- Ticket money Withdraw Failed ---");
								}
							}
							else
							{
								System.out.println("***  Invalid Ticket ... Can NOT Withdraw Money for it   ***");
							}
							
							break;
							
						case 3:
							
							System.out.println("-------------------------------------");
							System.out.println("You have selected Ticket Transaction History");
							System.out.println("-------------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
							
							System.out.println("-------------------------------------");
							System.out.println("You have selected to Go Back....");
							System.out.println("-------------------------------------");
							
							break;
							
						default:
							
							System.out.println("-------------------------------------");
							System.out.println("Invalid Option... Going Back...");
							System.out.println("-------------------------------------");
							break;
					}
					
					break;
					
				case 5:
				
					System.out.println("-------------------------------------");
					a.showDetails();
					System.out.println("-------------------------------------");
					
					break;
					
				case 6:
					
					repeat = false;
					System.out.println("-------------------------------------");
					System.out.println("Thank You for using our Airline");
					System.out.println("-------------------------------------");
					
					break;
				
				default:
					
					System.out.println("-------------------------------------");
					System.out.println("Invalid Choice... Please Try Again....");
					System.out.println("-------------------------------------");
					
					break;
			}
		}		
	}
}