class MultipleCatch{
 public static void main(String[] args){
  try{
   int a[]=new int[3];
   a[5]=10;
  }catch(ArithmeticException e){
   System.out.println("Arithmetic Error");
  }catch(ArrayIndexOutOfBoundsException e){
   System.out.println("Array Index Error");
  }
 }
}
