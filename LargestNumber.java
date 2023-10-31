import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Number 1 : ");
	    int a=sc.nextInt();
	    System.out.print("Enter Number 2 : ");
	    int b=sc.nextInt();
	    System.out.print("Enter Number 3 : ");
	    int c=sc.nextInt();
	    System.out.print("Enter Number 4 : ");
	    int d=sc.nextInt();
	    if(a>b && a>c && a>d)
	    	System.out.print("Largest Number is "+a);
	    else if(b>a && b>c && b>d)
	    	System.out.print("Largest Number is "+b);
	    else if(c>a && c>b && c>d)
	    	System.out.print("Largest Number is "+c);
	    else
	    	System.out.print("Largest Number is "+d);

	}

}
