package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
    public static void main(String[] args){

        DateandPlaceofBirth obja = new DateandPlaceofBirth(2000, 1, 1, "Binghamton"," New York", "USA");
        DateandPlaceofBirth objb = new DateandPlaceofBirth(2000, 1, 1, "Detroit", "Michigan", "USA");
        DateandPlaceofBirth objc = new DateandPlaceofBirth(2002, 9, 4, "Los Angeles", "California", "USA");
        DateandPlaceofBirth objd = new DateandPlaceofBirth(1998, 7, 5, "Lima", "Peru");
        DateandPlaceofBirth obje = new DateandPlaceofBirth(2003, 7, 5, "Rome", "Italy");

	System.out.println(obja);
	System.out.println(objb);
	System.out.println(objc);
	System.out.println(objd);
	System.out.println(obje);
	System.out.println(obja.olderthan(objb));
	System.out.println(objc.olderthan(objd));
	System.out.println(objd.olderthan(obje));
	System.out.println(obja.olderthan(obje));
	System.out.println(obja.youngerthan(objb));
	System.out.println(objc.youngerthan(objd));
	System.out.println(objd.youngerthan(obje));
	System.out.println(obja.youngerthan(obje));
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
        DateandPlaceofBirth obja2 = new DateandPlaceofBirth(2000, 1, 1, "Binghamton"," New York", "USA");
        DateandPlaceofBirth objb2 = new DateandPlaceofBirth(2000, 1, 1, "Detroit", "Michigan", "USA");
        DateandPlaceofBirth objc2 = new DateandPlaceofBirth(2002, 9, 4, "Los Angeles", "California", "USA");
        DateandPlaceofBirth objd2 = new DateandPlaceofBirth(1998, 7, 5, "Lima", "Peru");
        DateandPlaceofBirth obje2 = new DateandPlaceofBirth(2003, 7, 5, "Rome", "Italy");

        output.println(obja2);
	output.println(objb2);
	output.println(objc2);
        output.println(objd2);
	output.println(obje2);
        output.println(obja2.olderthan(objb2));
        output.println(objc2.olderthan(objd2));
	output.println(objd2.olderthan(obje2));
        output.println(obja2.olderthan(obje2));
        output.println(obja2.youngerthan(objb2));
	output.println(objc2.youngerthan(objd2));
	output.println(objd2.youngerthan(obje2));
	output.println(obja2.youngerthan(obje2));
	output.println(obja2.hasSameBirthDateAs(objb2));
	output.println(objc2.hasSameBirthDateAs(objd2));
	output.println(objd2.hasSameBirthDateAs(obje2));
       	output.println(obja2.hasSameBirthDateAs(obje2));
	output.println(obja2.hasSameBirthDayAs(objb2));
	output.println(objc2.hasSameBirthDayAs(objd2));
	output.println(objd2.hasSameBirthDayAs(obje2));
	output.println(obja2.hasSameBirthDayAs(obje2));

	
	
	
	

	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");


			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



    }
