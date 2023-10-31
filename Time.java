import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter time in Seconds :");
		int sec=sc.nextInt();
		int hour,minute,second;
		hour=sec/3600;
		minute=(sec-hour*3600)/60;				
		second=(sec-(hour*3600+minute*60));
		System.out.print("Time = ");
		System.out.println(hour+" : "+minute+" : "+second);
	}

	}


