package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
    public static void main(String[] args){

        DateAndPlaceOfBirth obja = new DateAndPlaceOfBirth(2000, 1, 1, "Binghamton"," New York", "USA");
        DateAndPlaceOfBirth objb = new DateAndPlaceOfBirth(2000, 1, 1, "Detroit", "Michigan", "USA");
        DateAndPlaceOfBirth objc = new DateAndPlaceOfBirth(2002, 9, 4, "Los Angeles", "California", "USA");
        DateAndPlaceOfBirth objd = new DateAndPlaceOfBirth(1998, 7, 5, "Lima", "Peru");
        DateAndPlaceOfBirth obje = new DateAndPlaceOfBirth(2003, 7, 5, "Rome", "Italy");

	System.out.println(obja);
	System.out.println(objb);
	System.out.println(objc);
	System.out.println(objd);
	System.out.println(obje);
	System.out.println(obja.olderThan(objb));
	System.out.println(objc.olderThan(objd));
	System.out.println(objd.olderThan(obje));
	System.out.println(obja.olderThan(obje));
	System.out.println(obja.youngerThan(objb));
	System.out.println(objc.youngerThan(objd));
	System.out.println(objd.youngerThan(obje));
	System.out.println(obja.youngerThan(obje));
	System.out.println(obja.hasSameBirthDateAs(objb));
	System.out.println(objc.hasSameBirthDateAs(objd));
	System.out.println(objd.hasSameBirthDateAs(obje));
       	System.out.println(obja.hasSameBirthDateAs(obje));
	System.out.println(obja.hasSameBirthDayAs(objb));
	System.out.println(objc.hasSameBirthDayAs(objd));
	System.out.println(objd.hasSameBirthDayAs(obje));
	System.out.println(obja.hasSameBirthDayAs(obje));
	
	
	
	
	
	

	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
        DateAndPlaceOfBirth obja2 = new DateAndPlaceOfBirth(2000, 1, 1, "Binghamton"," New York", "USA");
        DateAndPlaceOfBirth objb2 = new DateAndPlaceOfBirth(2000, 1, 1, "Detroit", "Michigan", "USA");
        DateAndPlaceOfBirth objc2 = new DateAndPlaceOfBirth(2002, 9, 4, "Los Angeles", "California", "USA");
        DateAndPlaceOfBirth objd2 = new DateAndPlaceOfBirth(1998, 7, 5, "Lima", "Peru");
        DateAndPlaceOfBirth obje2 = new DateAndPlaceOfBirth(2003, 7, 5, "Rome", "Italy");

        output.println(obja2);
	output.println(objb2);
	output.println(objc2);
        output.println(objd2);
	output.println(obje2);
        output.println(obja2.olderThan(objb2));
        output.println(objc2.olderThan(objd2));
	output.println(objd2.olderThan(obje2));
        output.println(obja2.olderThan(obje2));
        output.println(obja2.youngerThan(objb2));
	output.println(objc2.youngerThan(objd2));
	output.println(objd2.youngerThan(obje2));
	output.println(obja2.youngerThan(obje2));
	output.println(obja2.hasSameBirthDateAs(objb2));
	output.println(objc2.hasSameBirthDateAs(objd2));
	output.println(objd2.hasSameBirthDateAs(obje2));
       	output.println(obja2.hasSameBirthDateAs(obje2));
	output.println(obja2.hasSameBirthDayAs(objb2));
	output.println(objc2.hasSameBirthDayAs(objd2));
	output.println(objd2.hasSameBirthDayAs(obje2));
	output.println(obja2.hasSameBirthDayAs(obje2));

	
	
	
	



			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

        }
    }
   


