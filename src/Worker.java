public class Worker extends Thread {

    Sequence sequence = null;

    public Worker(Sequence sequence) {
        this.sequence = sequence;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " Got Value: " + sequence.getNext());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
