package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester{
    public static void main(String[] args){
	StreetUSAddress obja  = new StreetUSAddress("103-21", "104-54", "Atlanta", "GA", "12312");
	StreetUSAddress objb = new StreetUSAddress("87-32","" , "Miami", "FL", "43121");
	System.out.println(obja);
	System.out.println(objb);

	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
       	StreetUSAddress obja2  = new StreetUSAddress("103-21", "104-54", "Atlanta", "GA", "12312");
	StreetUSAddress objb2 = new StreetUSAddress("87-32","" , "Miami", "FL", "43121");
        output.println(obja2);
	output.println(objb2);

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



    } 


















}
