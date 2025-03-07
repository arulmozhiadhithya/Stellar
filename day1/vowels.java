package day1;
import java.util.*;
public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str.charAt(i)=='u') {
				count ++;
			}
		}
		System.out.println(count);

	}
}
