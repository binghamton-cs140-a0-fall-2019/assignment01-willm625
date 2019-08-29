package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class PersonTester  {
    public static void main(Strings[] args){
	 DateAndPlaceofBirth am = new DateAndPlaceofBirth(2004, 4, 3, "Houston", "Texas", "USA");
	 StreetUSAddress ma = new StreetUSAddress("98-07", "102-21","Houston", " TX", "12312");
	 Person pa = new Person("John", "Walker"," 111-11-1111", am, ma);
	 System.out.println(pa);
	 try(var output =new PrintWriter(new FileOutputStream(
	 new File("output.txt"), true /* true means append to file */))) {
	 output.println("\nTESTS FOR Person.java:");

	 //Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
	 DateAndPlaceofBirth am2 = new DateAndPlaceofBirth(2004, 4, 3, "Houston", "Texas", "USA");
	 StreetUSAddress ma2 = new StreetUSAddress("98-07", "102-21","Houston", "TX", "12312");
	 Person pa2 = new Person("John", "Walker"," 111-11-1111", am2, ma2);
	        output.println(pa2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			       


    }







}
