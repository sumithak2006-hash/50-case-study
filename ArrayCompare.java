import java.util.*;
class ArrayCompare{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), a[]=new int[n], b[]=new int[n], f=1;
  for(int i=0;i<n;i++) a[i]=sc.nextInt();
  for(int i=0;i<n;i++) b[i]=sc.nextInt();
  for(int i=0;i<n;i++) if(a[i]!=b[i]) f=0;
  System.out.println(f==1?"Identical":"Not Identical");
 }
}
