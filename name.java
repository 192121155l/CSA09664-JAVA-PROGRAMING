# CSA09664-JAVA-PROGRAMING
import java.util.*;
public class name{ 
public static void main(String args[])
{ 
 String s1,s2; 
 boolean result;
 Scanner s= new Scanner(System.in);
 s1=s.nextLine();
 s2=s.nextLine();
 result=s1.equals(s2);
 if (result==false)
 {
 System.out.println("User name is Invalid");
 }
 else
 {
 System.out.println("User name is valid");
 }
}
}
