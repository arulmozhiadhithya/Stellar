package day1;
import java.util.*;
public class mail_invalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		System.out.println(email);
		if(email.contains("com") || email.contains("in") || email.contains("net") || email.contains("org")) {
			System.out.println("valid email address");
		}
		else {
			System.out.println("Invalid email address");
		}				
	}
}
