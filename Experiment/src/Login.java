import java.util.*;
public class Login {
	public static void main(String args []) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username");
		String username = scan.next();
		System.out.println(username);
		
		if(username.equalsIgnoreCase(username)) {
			System.out.println("Valid username");
		}
		else {
			System.out.println("Invalid username");
		}
		
		
		System.out.println("Enter password");
		String password = scan.next();
		
		if(password.equals(password)) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Wrong password");
		}
		
	}

}
