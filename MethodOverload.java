class MethodOverload{
 void add(int a,int b){ System.out.println(a+b); }
 void add(double a,double b){ System.out.println(a+b); }
 public static void main(String[] args){
  MethodOverload m=new MethodOverload();
  m.add(5,3); m.add(2.5,1.5);
 }
}
