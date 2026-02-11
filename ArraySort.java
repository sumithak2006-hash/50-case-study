import java.util.*;
class ArraySort{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), a[]=new int[n], t;
  for(int i=0;i<n;i++) a[i]=sc.nextInt();
  for(int i=0;i<n;i++)
   for(int j=i+1;j<n;j++)
    if(a[i]>a[j]){ t=a[i]; a[i]=a[j]; a[j]=t; }
  for(int i:a) System.out.print(i+" ");
 }
}
