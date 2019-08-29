package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester{
    static SimpleDate datea = SimpleDate.of(2000, 4, 1);
    static  SimpleDate dateb = SimpleDate.of(2001, 3, 4);
    static SimpleDate datea2 = SimpleDate.of(2000, 4, 1);
    static  SimpleDate dateb2 = SimpleDate.of(2001, 3, 4);
    public static void main(String[] args){  
          System.out.println(datea.before(dateb));

	  try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
      		// by output.print or output.println

			output.println(datea2.before(dateb2));		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
    }

    }

}
