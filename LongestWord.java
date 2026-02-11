import java.util.*;
class LongestWord{
 public static void main(String[] args){
  String s=new Scanner(System.in).nextLine();
  String w[]=s.split(" "), max="";
  for(String x:w) if(x.length()>max.length()) max=x;
  System.out.println(max);
 }
}
