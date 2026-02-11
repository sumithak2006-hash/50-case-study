import java.util.*;
class FibonacciSeries{
 public static void main(String[] args){
  int n=new Scanner(System.in).nextInt(), a=0,b=1,c;
  for(int i=1;i<=n;i++){ System.out.print(a+" "); c=a+b; a=b; b=c; }
 }
}
