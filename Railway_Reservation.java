
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
 class Railway_Reservation {
    
//scanner impletion 
Scanner sc = new Scanner(System.in);
// varibles impletion
String name,address;
double mobileno;
int age,no_of_ticket;
int pincode;
double total=0;
/*City varible */String city[]={"null"," Nagpur to Pune","Nagpur to Delhi"," Nagpur to Mumbai","Nagpur to Lucknow","Nagpur to Hyderabad"};
// switch varible 
int  Destination;
// get Details method
public  void Getdetails()
{
    System.out.println("Enter your name = ");
    name = sc.next().toString();
    System.out.println("Enter your Age = ");
    age = sc.nextInt();
    System.out.println("Enter your mobile no = ");
    mobileno = sc.nextDouble();
    System.out.println("Enter your Address = ");
    address = sc.next().toString();
    System.out.println("Enter your pincode = ");
    pincode = sc.nextInt();
    }
    // menu method
public void Menu()
{
System.out.println("Press 1 for Nagpur to Pune");
System.out.println("Press 2 for Nagpur to Delhi");
System.out.println("Press 3 for Nagpur to Mumbai");
System.out.println("Press 4 for Nagpur to Lucknow");
System.out.println("Press 5 for Nagpur to Hyderabad");
}
// Destion  method 
    public  void Destination() 
{
   
    Destination = sc.nextInt();
    switch(Destination)
    {
        case 1:
            System.out.println("Nagpur to Pune");
        break;
        
         case 2:
            System.out.println("Nagpur to Delhi");
         break;
           case 3:
            System.out.println("Nagpur to Mumbai");
         break;
         case 4:
            System.out.println("Nagpur to Lucknow");
         break;
        case 5:
            System.out.println("Nagpur to Hyderabad");
         break;
        
        default :
         System.out.println("Invalid Input");
         
    } 
        
    }
    
    //  number of Tickets 
    public void tickets()
    {
   System.out.println("Please Enter number of tickets = ");
    no_of_ticket = sc.nextInt();
    }
   
    
  // method for calculation
  public void calcu()
  {
  if (Destination==1)
    {
        total = (no_of_ticket*500);
       
    }
  else if (Destination==2)
    {
        total = (no_of_ticket*700);
    }
  else if(Destination==3)
  {
      total = (no_of_ticket*1000);
  }
   else if(Destination==4)
  {
      total = (no_of_ticket*1200);
  }
   else if(Destination==5)
  {
      total = (no_of_ticket*15000);
  }
  System.out.flush();
  }
  public void flush()
  {
  System.out.flush();  
  }
  // method for display
  public  void Display()
  {
  LocalDate date=LocalDate.now();
  LocalTime t=LocalTime.now();
  Random r = new Random();
  int upperbound = 9999;
  int int_random = r.nextInt(9999);
  System.out.println("----------------------------------------------------------------");
            System.out.println("                     Vendata RAIL                     ");
            System.out.println("------------------------------------------------------");
            System.out.println("Date : "+date+"               Time : "+t              );
            System.out.println("Trai no:"+(10000+int_random)                          );
            System.out.println("                                  HelplLine no. 110  ");
            System.out.println("Number of passenger "+ no_of_ticket);
            System.out.println("_____________________________________________________");
            System.out.println("                                                     ");
            System.out.println(city[Destination]);
            System.out.println("_____________________________________________________");
            System.out.println("passenger Details ");
            System.out.println("_____________________________________________________");
            System.out.println("passenger Name "+ name);
            System.out.println("passenger Age "+ age);
            System.out.println("passenger Mobile_Number "+ mobileno);
            System.out.println("passenger Address "+ address);
            System.out.println("Pincode "+ pincode);
            System.out.println("_____________________________________________________");
            System.out.println("Total_Amount to pay  "+ total);
            System.out.println("*****************************************************"); 
           System.out.println("                  Thanks for Travelling                      ");
           System.out.println("*****************************************************");  
 
  
  }         
    
// main method
public static void main(String[] args) {
        Railway_Reservation r = new Railway_Reservation();
        r.Getdetails();
        r.Menu();
        r.Destination();
        r.tickets();
        r.calcu();
        r.flush();
        r.Display();
       
    }

    
}
