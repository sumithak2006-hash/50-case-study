class Task extends Thread{
 public void run(){
  System.out.println(Thread.currentThread().getName()+" running");
 }
 public static void main(String[] args){
  new Task().start();
  new Task().start();
 }
}
