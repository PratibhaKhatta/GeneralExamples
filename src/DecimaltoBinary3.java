import java.util.Scanner;
import java.util.Stack;
public class DecimaltoBinary3

{
	public static void main(String args[])
	{
       System.out.println("Enter the number");
       @SuppressWarnings("resource")
	Scanner in= new Scanner(System.in);
       int number= in .nextInt();
       Stack<Integer> stack= new Stack<Integer>();
       while(number>0)
      {
    	  int num=number%2;
    	  stack.push(num);
    	  num=num/2;
    	 
     }
       System.out.println("Binary representation");
       while((!stack.isEmpty()))
       {
    	   System.out.println(stack.pop());
       }
       System.out.println();
     
	}  
}
