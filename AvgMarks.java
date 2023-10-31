import java.util.Scanner;

public class AvgMarks {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int sum=0;
		 for(int i=1;i<=5;i++) 
		 {
		 System.out.print("Marks in Subject "+i+" : ");
		 int a=sc.nextInt();
		 sum=sum+a;
		 }
		 float avg=(float)sum/5;
		 System.out.println("Total Mraks = "+sum);
		 System.out.println("Average Marks = "+avg);
		 if(avg>=60)
			 System.out.println("First Division");
		 else if(avg>=45 && avg<60)
			 System.out.println("Second Division");
		 else if(avg>=33 && avg<45)
			 System.out.println("Third Division");
		 else
			 System.out.println("Fail");



	}

}
