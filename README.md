import java.util.*; 
class unique{
public static void main(String[] args){
Scanner sc= new Scanner(System.in); 
System.out.print("Enter a string: "); 
String str= sc.nextLine(); 
int n = str.length();
unique permutation = new unique();
permutation.permute(str, 0, n-1);
}
private void permute(String str, int l, int r)
{
if (l == r)
System.out.println(str);
else{
for (int i = l; i <= r; i++){
str = swap(str,l,i);
permute(str, l+1, r);
str = swap(str,l,i);
}
}
}
public String swap(String a, int i, int j)
{
char temp;
char[] charArray = a.toCharArray();
temp = charArray[i] ;
charArray[i] = charArray[j];
charArray[j] = temp;
return String.valueOf(charArray);
}
}
