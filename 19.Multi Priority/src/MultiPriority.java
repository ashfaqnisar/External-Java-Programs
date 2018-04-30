public class MultiPriority extends Thread{

    public void run(){
        System.out.println("Running Thread "+Thread.currentThread().getName());
        System.out.println("Priority of the Thread is "+ Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        MultiPriority M1 = new MultiPriority();
        MultiPriority M2 = new MultiPriority();

        M1.setPriority(MIN_PRIORITY);
        M2.setPriority(MAX_PRIORITY);

        M1.start();
        M2.start();
    }
}
