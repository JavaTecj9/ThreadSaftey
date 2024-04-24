public class Application {
    public static void main(String[] args) {

        Sequence sequence = new Sequence();

        //The sequence Object is being updated by two different threads:
        Worker worker1 = new Worker(sequence);
        worker1.start();
        Worker worker2 = new Worker(sequence);
        worker2.start();



    }
}