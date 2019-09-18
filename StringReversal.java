import java.util.*;

class StringReversal {
public static void main(String[] args){
 String str = "Hello World";
 System.out.println("Reversed String: " + reverseString(str)); //space after '+' printline - ("Reversed String: " + reverseString(str))
}//empty line after the method here
  
public static String reverseString(String str) {
  char[] charinput = str.toCharArray(); // variable name should be charInput (camelCase)
  int index = 0;
  char temp;
  
  for(int i=charinput.length-1; i>=(charinput.length/2); i--,index++) {
    temp = charinput[index];
    charinput[index] = charinput[i];
    charinput[i] = temp;
  }
  
  return new String(charinput); // Can also do String.valueOf(charinput) // Why not return on line 17 - return new String(charinput) or return String.valueOf(charinput) instead of line #17 and 18
}
   
}
