# CSA09664-JAVA-PROGRAMING
import java.util.*;
class three{
public  static void main(String []args){
Scanner sc=new Scanner(System.in);
int n,i,b=0;
System.out.println("input=");
n=sc.nextInt();
for(i=0;i< n/2;i++)
{
if(i*i*i==n)
{
b=1;
break;
}
else
{
b=0;
}
}
if(b==1)
{
System.out.println("true");
}
else
{
System.out.println("false");
}
}
}
