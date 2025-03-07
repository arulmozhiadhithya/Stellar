package day1;
import java.util.*;
import java.util.Scanner;

public class alternative_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int length=str.length();
		for(int i=0;i<length;i++) {
			if(str.charAt(i)==str.charAt(i+2)&& str.charAt(i+1)==str.charAt(i+3)) {
				System.out.println("yes");
				break;
			}
			else {
				System.out.println("no");
				break;
			}
		}

	}

}
