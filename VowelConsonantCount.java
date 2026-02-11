import java.util.*;
class VowelConsonantCount{
 public static void main(String[] args){
  String s=new Scanner(System.in).nextLine().toLowerCase();
  int v=0,c=0;
  for(char ch:s.toCharArray())
   if(ch>='a'&&ch<='z')
    if("aeiou".indexOf(ch)>=0) v++; else c++;
  System.out.println("Vowels:"+v+" Consonants:"+c);
 }
}
