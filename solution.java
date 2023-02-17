import java.util.*;
class Solution {
 public static void main(String[] args) {
 Scanner sc= new Scanner((System.in));
 System.out.println("Enter the input String:-");
String input= sc.nextLine();
 input=input.toUpperCase();
 HashMap<Character,Integer> map= new HashMap<>();
for(char c:input.toCharArray()){
            if(!map.containsKey(c))
            {
                map.put(c,1);
            }else{
                int freq= map.get(c);
                map.put(c,freq+1);
            }    
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }
    }
 
}
