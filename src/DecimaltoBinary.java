import java.util.Scanner;
public class DecimaltoBinary 
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		System.out.println("binary representation ");
		System.out.println(Integer.toBinaryString(number));
	}

}
