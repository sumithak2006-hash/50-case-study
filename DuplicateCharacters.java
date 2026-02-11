import java.util.*;
class DuplicateCharacters{
 public static void main(String[] args){
  String s=new Scanner(System.in).nextLine();
  for(int i=0;i<s.length();i++)
   for(int j=i+1;j<s.length();j++)
    if(s.charAt(i)==s.charAt(j)){ System.out.print(s.charAt(i)+" "); break; }
 }
}
