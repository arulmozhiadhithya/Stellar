package day1;
import java.util.*;
public class middlevalue {

  	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		Scanner sc=new Scanner(System.in);
  		String str1=sc.nextLine();
  		int middle=0;
  		int length=str1.length();
  		System.out.println(length);
  		
  		for(int i=0;i<length;i++) {
  			middle=length/2;
  		}
        System.out.println(middle);
	}

}
