package day1;
import java.util.*;
public class luckywinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		if(a%10 == 3 || a%10 == 8)
		{
			System.out.println("lucky winner");
		}
		else {
			System.out.println("No Lucky Winner");
		}
				

	}

}
