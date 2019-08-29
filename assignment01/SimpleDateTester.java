package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester{
    SimpleDate date = SimpleDate.of(2000, 4, 1);
    SimpleDate dateb = SimpleDate.of(2001, 3, 4);
    System.out.println(date.before(dateb));

}
