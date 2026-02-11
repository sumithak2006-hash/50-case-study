import java.util.*;
class SumAverage{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), a[]=new int[n], sum=0;
  for(int i=0;i<n;i++){ a[i]=sc.nextInt(); sum+=a[i]; }
  System.out.println("Sum="+sum+" Avg="+(sum/(double)n));
 }
}
