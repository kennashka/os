
public class DecrementingThread extends Thread {

    private GlobalClass globalClass;

    public DecrementingThread(GlobalClass globalClass) {

        this.globalClass = globalClass;

    }

    public void run() {

        for (int i = 0; i < 90000000; i++) {

            globalClass.decrementGlobal();

        }

    }

}
