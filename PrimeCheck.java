import java.util.*;
class PrimeCheck{
 public static void main(String[] args){
  int n=new Scanner(System.in).nextInt(), f=0;
  for(int i=2;i<=n/2;i++) if(n%i==0) f=1;
  System.out.println(n>1 && f==0?"Prime":"Not Prime");
 }
}
