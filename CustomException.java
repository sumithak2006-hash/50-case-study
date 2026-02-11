class InvalidAgeException extends Exception{
 InvalidAgeException(String s){ super(s); }
}
class CustomException{
 public static void main(String[] args){
  try{
   int age=15;
   if(age<18) throw new InvalidAgeException("Invalid Age");
  }catch(Exception e){
   System.out.println(e.getMessage());
  }
 }
}
