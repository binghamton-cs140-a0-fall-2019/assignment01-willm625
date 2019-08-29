package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester{
    public static void main(String[] args) {
	DateAndPlaceOfBirth tap = new DateAndPlaceOfBirth(2001, 5, 1, "Sacramento", "California", "USA");
	StreetUSAddress zap = new StreetUSAddress("34-02", "32-09","Sacramento", "CA", "54321");
	Person ap = new Person("Joe", "Low", "444-44-4444", tap, zap);
	ComputerOwner Joseph = new ComputerOwner(ap);
	Computer fe = new Computer("macbook", "new", 16, 1001, true, 100.9 );
	Computer fi = new Computer("windows", "old", 32, 1002, false, 99.9 );
	Computer fo = new Computer("lenovo", "refurbished", 500, 998, false, 200.01 );
	Computer fum = new Computer("dell", "new", 128, 999, false, 300.30);
	
	Joseph.addComputer(fe);
	Joseph.addComputer(fi);
	Joseph.addComputer(fo);
	Joseph.addComputer(fum);
	
	
	// print object
	System.out.println(Joseph);
	// removing two computers
	Joseph.removeComputer(2);
	
       	System.out.println(Joseph);


	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwnerTester.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
	DateAndPlaceOfBirth tap2 = new DateAndPlaceOfBirth(2001, 5, 1, "Sacramento", "California", "USA");
	StreetUSAddress zap2 = new StreetUSAddress("34-02", "32-09","Sacramento", "CA", "54321");
	Person ap2 = new Person("Joe", "Low", "444-44-4444", tap2, zap2);
	ComputerOwner Joseph2 = new ComputerOwner(ap2);
	Computer fe2 = new Computer("macbook", "new", 16, 1001, true, 100.9 );
	Computer fi2 = new Computer("windows", "old", 32, 1002, false, 99.9 );
	Computer fo2 = new Computer("lenovo", "refurbished", 500, 998, false, 200.01 );
	Computer fum2 = new Computer("dell", "new", 128, 999, false, 300.30);
	Joseph2.addComputer(fe2);
	Joseph2.addComputer(fi2);
	Joseph2.addComputer(fo2);
	Joseph2.addComputer(fum2);
	
	
	// print object
	System.out.println(Joseph2);
	// removing two computers
	Joseph2.removeComputer(2);
	
       	System.out.println(Joseph2);

     
  
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
 


    }




}
