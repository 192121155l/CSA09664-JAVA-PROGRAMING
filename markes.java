# CSA09664-JAVA-PROGRAMING
import java.util.*; 
public class markes
{ 
 public static void main(String args[]) 
 { 
 Scanner sc = new Scanner(System.in); 
 int n; 
 System.out.println("Enter the total subjects ");
 n=sc.nextInt();
 int arr[] = new int[n]; 
 for(int i=0;i<n;i++) 
 {
 System.out.println("Enter subject mark:");
 arr[i]=sc.nextInt();
 
 }
 
 int total=0;
 for(int i=0;i<n;i++)
 {
 total=total+arr[i];
 }
 System.out.println("The total marks obtained is "+total);
 float percentage; 
 percentage = (total / (float)n); 
 System.out.println( "Total Percentage : " + percentage + "%"); 
 } 
}
