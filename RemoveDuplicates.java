import java.util.*;
class RemoveDuplicates{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), a[]=new int[n];
  for(int i=0;i<n;i++) a[i]=sc.nextInt();
  for(int i=0;i<n;i++){
   int j; for(j=0;j<i;j++) if(a[i]==a[j]) break;
   if(i==j) System.out.print(a[i]+" ");
  }
 }
}
