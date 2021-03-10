import java.util.Scanner;
import java.util.regex.Pattern;
public class Firstname {
	
	static   Scanner name = new  Scanner (System.in); 
	static void Mail() {
	    String email = name.nextLine();
	    boolean  user= Pattern.matches("^[A-Za-z0-9+-]+(\\\\.[A-Za-z0-9-]+)*@\" + \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$", email);
	    if (user == true ) {
	      	System.out.println("you entered a valid email  :" +email);
	    }
       else { 
            System.out.println ("Not a valid email");
			   System.out.println("Enter valid email");
			   Mail();
	    }
	}
	
   public static void main(String[] args) {
	   System.out.println("enter  email id");
	   Mail();
   }
}
