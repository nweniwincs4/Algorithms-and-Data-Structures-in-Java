public class MultiThreadTest extends Thread {
    static int amount=0;
    public static void main(String[] args) {
      MultiThreadTest thread = new MultiThreadTest();
      thread.start();
      while(thread.isAlive()) {
        System.out.println("Waiting...");
      }
      // Update amount and print its value
      System.out.println("Outside Thread: " + amount);
      amount++;
      System.out.println("Outside Thread: " + amount);
    }
    @Override
    public void run(){
        try{
            amount++;
            Thread.sleep(1000);
            System.out.println("This code is running in a thread");
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
  }
