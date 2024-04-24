public class Sequence {

    private int value = 0;

    public int getNext() {
        //add synchronized like below to put a 'lock' on the code so it is completed
        synchronized (this) {
            value++;
            return value;

        }

    }
}
            /**  Another way to implement synchronized on the whole method:
             public synchronized int getNex(){
                    value++;
                    return value;
             }
            **/