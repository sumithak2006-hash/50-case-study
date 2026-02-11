class ConstructorOverload{
 ConstructorOverload(){ System.out.println("Default Constructor"); }
 ConstructorOverload(int a){ System.out.println("Value: "+a); }
 public static void main(String[] args){
  new ConstructorOverload();
  new ConstructorOverload(10);
 }
}
