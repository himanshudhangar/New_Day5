package Basic_Core;
import java.util.Scanner;
public class Flip_coin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter  no of times  to flip the coin");
		int times = s.nextInt();
		double heads = 0;
		for (int i = 0; i < times; i++)
		{
			if (Math.random() > 0.5)
			{
			 heads++;
			}
		}
		System.out.println("heads percentage is " + (float) (heads / times) * 100);
		System.out.println("tails percentage is " + (float) (times - heads) / times * 100);

	}

}
