import java.util.*;
class FactorialCalc{
 public static void main(String[] args){
  int n=new Scanner(System.in).nextInt(), f=1;
  for(int i=1;i<=n;i++) f*=i;
  System.out.println(f);
 }
}
