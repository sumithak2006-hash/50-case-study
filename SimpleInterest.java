class SimpleInterest{
 double p,t,r;
 void calculate(){
  System.out.println((p*t*r)/100);
 }
 public static void main(String[] args){
  SimpleInterest s=new SimpleInterest();
  s.p=1000; s.t=2; s.r=5;
  s.calculate();
 }
}
