# CSA09664-JAVA-PROGRAMING
import java.util.*;
class composite {
 static Scanner input = new Scanner(System.in);
 public static void main(String[] args) {
 System.out.print("enter the starting number:");
 int start = input.nextInt()+1;
 System.out.print("enter the ending number:");
 int end = input.nextInt();
 while(start<=end){
 int count = 10;
 int j = 2;
 while(j<start){
 if(start%j==0)
 count++;
 j++;
 }
 if(count>0)
 System.out.println(start);
}
}
}
