package day1;
import java.util.*;

public class trendy_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int middle=a/10;
		if(middle%3==0) {
			System.out.println( a +"Trendy Number");
		}
		else {
			System.out.println(a +"Not a Trendy Number");
		}
		
		
		
		

	}

}