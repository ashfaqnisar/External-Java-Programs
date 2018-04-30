class MultiThread extends Thread {
    private Thread t;
    private String threadName;

    MultiThread(String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }
    public void start () {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public static void main(String args[]) {
        MultiThread T1 = new MultiThread( "Thread-1");
        T1.start();

        MultiThread T2 = new MultiThread( "Thread-2");
        T2.start();
    }
}