import java.util.*;
class PowerCalc{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int b=sc.nextInt(), e=sc.nextInt(), p=1;
  for(int i=1;i<=e;i++) p*=b;
  System.out.println(p);
 }
}
