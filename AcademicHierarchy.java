class University{
 void uni(){ System.out.println("University Level"); }
}
class College extends University{
 void college(){ System.out.println("College Level"); }
}
class Student extends College{
 public static void main(String[] args){
  Student s=new Student();
  s.uni(); s.college();
  System.out.println("Student Level");
 }
}
