import java.util.regex.*;
import java.util.Scanner;
public class UserRegistrationUC2 {
	private boolean check;
    private String lastName;
    Scanner sc = new Scanner(System.in);
    public void checkLastName() {
   	    System.out.println("enter last name starts with cap and has minimum 3 character : ");
   	    lastName = sc.nextLine();
   	    check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
   	    if (!check) {
   		     System.out.println(" last name is invalid ");
   		     checkLastName();
   	    }
   	    else
   		     System.out.println(" last name is valid ");
    }
    public static void main(String args[]) {
   	     UserRegistrationUC2 user = new UserRegistrationUC2();
   	     user.checkLastName();
    }
}
