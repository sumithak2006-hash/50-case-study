import java.util.*;
class MaxArray{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), a[]=new int[n], max;
  for(int i=0;i<n;i++) a[i]=sc.nextInt();
  max=a[0]; for(int i:a) if(i>max) max=i;
  System.out.println(max);
 }
}
