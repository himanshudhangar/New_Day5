package Basic_Core;
import java.util.Scanner;
public class Power_Two {

	public static void main(String[] args) {
		int power,val=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        power=sc.nextInt();
        for(int i=0;i<=power;i++)
        {
        	val=val*2;
        	System.out.println(val);
        	if(power>31)
        	{
        		System.out.println("invalid input");
        		System.out.println("enter value less than 32");
        		power=sc.nextInt();
        	}
        }   
	}

}
