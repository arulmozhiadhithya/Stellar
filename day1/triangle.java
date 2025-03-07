package day1;
import java.util.*;
public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int sum=a+b+c;
		if(sum==180) {
			if(a==90 || b==90 || c==90) {
				System.out.println("price 2: right");
			}
			else if(a==b && b==c && a==c) {
				System.out.println("price 3: equa");
			}
			else {
				System.out.println("price 1: simple tri");
			}
		}
		else {
			System.out.println("no triangle");
		}
		
				

	}
 
}
