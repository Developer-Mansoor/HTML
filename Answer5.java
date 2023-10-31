import java.util.Scanner;

public class Answer5 {

	public static void main(String[] args) {
           Scanner sc =new Scanner(System.in);
           System.out.print("Enter a NUmber : ");
           int a=sc.nextInt();
           if(a%2==0)
           {
        	   if(a>20)
        		   System.out.print("Not Weird");
        	   else if(a>14 && a<=20)
        		   System.out.print("Weird");
        	   else if(a>6 && a<=14)
        		   System.out.print("Not Weird");
        	   else if (a>=1 && a<=6)
        		   System.out.print("Weird");
           }
           else
           {
        	   System.out.println("Nuber is odd");
        	   System.out.print("Weird");
           }
	}

}
