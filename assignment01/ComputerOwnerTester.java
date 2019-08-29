package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester{
    public static void main(String[] args) {
	DateAndPlaceofBirth tap = new DateAndPlaceofBirth(2001, 5, 1, "Sacramento", "California", "USA");
	StreetUSAddress zap = new StreetUSAddress("34-02", "32-09","Sacramento", "CA", "54321");
	Person ap = new Person("Joe", "Low", "444-44-4444", tap, zap);
	ComputerOwner Joseph = new ComputerOwner(ap);
	Computer one = new Computer("macbook", "new", 16, 1001, true, 100.9 );
	Computer two = new Computer("windows", "old", 32, 1002, false, 99.9 );
	Computer three = new Computer("lenovo", "refurbished", 500, 998, false, 200.01 );
	Computer four = new Computer("dell", "new", 128, 999, false, 300.30);
	
	Joseph.addComputer(one);
	Joseph.addComputer(two);
	Joseph.addComputer(three);
	Joseph.addComputer(four);
	
	
	// print object
	System.out.println(Joseph);
	// removing two computers
	Joseph.removeComputer(three);
	Joseph.removeComputer(four);
	
       	System.out.println(Joseph);


	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwnerTester.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
	DateAndPlaceofBirth tap2 = new DateAndPlaceofBirth(2001, 5, 1, "Sacramento", "California", "USA");
	StreetUSAddress zap2 = new StreetUSAddress("34-02", "32-09","Sacramento", "CA", "54321");
	Person ap2 = new Person("Joe", "Low", "444-44-4444", tap2, zap2);
	ComputerOwner Joseph2 = new ComputerOwner(ap2);
	Computer one2 = new Computer("macbook", "new", 16, 1001, true, 100.9 );
	Computer two2 = new Computer("windows", "old", 32, 1002, false, 99.9 );
	Computer three2 = new Computer("lenovo", "refurbished", 500, 998, false, 200.01 );
	Computer four2 = new Computer("dell", "new", 128, 999, false, 300.30);
	Joseph2.addComputer(one2);
	Joseph2.addComputer(two2);
	Joseph2.addComputer(three2);
	Joseph2.addComputer(four2);
	
	
	// print object
	System.out.println(Joseph2);
	// removing two computers
	Joseph2.removeComputer(three2);
	Joseph2.removeComputer(four2);
	
       	System.out.println(Joseph2);

     
  
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
 


    }




}
