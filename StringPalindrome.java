import java.util.*;
class StringPalindrome{
 public static void main(String[] args){
  String s=new Scanner(System.in).nextLine(), r="";
  for(int i=s.length()-1;i>=0;i--) r+=s.charAt(i);
  System.out.println(s.equals(r)?"Palindrome":"Not Palindrome");
 }
}

