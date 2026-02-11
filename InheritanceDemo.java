class Organization{
 void show(){ System.out.println("Organization Details"); }
}
class Employee extends Organization{
 void display(){ System.out.println("Employee Details"); }
 public static void main(String[] args){
  Employee e=new Employee();
  e.show(); e.display();
 }
}
