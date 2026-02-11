abstract class Shape{
 abstract void area();
}
class Rectangle extends Shape{
 void area(){ System.out.println(5*4); }
 public static void main(String[] args){
  Shape s=new Rectangle();
  s.area();
 }
}
