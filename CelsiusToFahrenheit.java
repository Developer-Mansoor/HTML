import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Temperature in Celsius :");
		int a=sc.nextInt();
		float b=a*9/5+32;
		System.out.print("Fahrenheit = "+b);

	}

}
