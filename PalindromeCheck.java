import java.util.*;
class PalindromeCheck{
 public static void main(String[] args){
  int n=new Scanner(System.in).nextInt(), r=0, t=n;
  while(t>0){ r=r*10+t%10; t/=10; }
  System.out.println(n==r?"Valid":"Invalid");
 }
}
