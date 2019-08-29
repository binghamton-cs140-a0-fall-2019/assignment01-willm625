package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
	    Computer compa = new Computer("macbook", "new", 16, 1001, true, 100.9 );
	    Computer compb = new Computer("windows", "old", 32, 1002, false, 99.9 );
	    Computer compc = new Computer("lenovo", "refurbished", 500, 998, false, 200.01 );
	    Computer compd = new Computer("dell", "new", 128, 999, false, 300.30);
	
		System.out.println(compa);
		System.out.println(compb);
		System.out.println(compc);
		System.out.println(compd);
		
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
	    Computer compa2 = new Computer("macbook", "new", 16, 1001, true, 100.9 );
	    Computer compb2 = new Computer("windows", "old", 32, 1002, false, 99.9 );
	    Computer compc2 = new Computer("lenovo", "refurbished", 998, 120, false, 200.01 );
	    Computer compd2 = new Computer("dell", "new", 128, 999, false, 300.30);
                output.println(compa2);
                output.println(compb2);
		output.println(compc2);
		output.println(compd2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
