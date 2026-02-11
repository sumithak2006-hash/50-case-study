class JoinDemo extends Thread{
 public void run(){
  System.out.println("Task completed");
 }
 public static void main(String[] args) throws Exception{
  JoinDemo t=new JoinDemo();
  t.start();
  t.join();
  System.out.println("Next task started");
 }
}
