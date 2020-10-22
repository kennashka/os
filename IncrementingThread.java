
public class IncrementingThread extends Thread {

    private GlobalClass globalClass;

    public IncrementingThread(GlobalClass globalClass) {

        this.globalClass = globalClass;

    }

    public void run() {

        for (int i = 0; i < 90000000; i++) {

            globalClass.incrementGlobal();

        }

    }

}
