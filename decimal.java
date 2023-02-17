import java.util.*;
class decimal{
public static void main(String args[]){      
int binary[] = new int[40];    
     int index = 0;   
	 Scanner s= new Scanner(System.in);
	 System.out.print("Enter the Decimal value : ");  
	 int decimal= s.nextInt();
	 System.out.println("Decimal of"+ decimal+" is: ");  
     while(decimal > 0){    
       binary[index++] = decimal%2;    
       decimal = decimal/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }    
System.out.println(); 

}
}
