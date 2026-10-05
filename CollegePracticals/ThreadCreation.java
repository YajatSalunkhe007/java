package CollegePracticals;

public class ThreadCreation extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        ThreadCreation t = new ThreadCreation();
        t.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}
