class FinallyDemo{
 public static void main(String[] args){
  try{
   int a=10/2;
   System.out.println(a);
  }finally{
   System.out.println("Cleanup done");
  }
 }
}
