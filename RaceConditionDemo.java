
public class RaceConditionDemo {

    public static void main(String[] args) {

        GlobalClass globalClass = new GlobalClass();

        IncrementingThread it = new IncrementingThread(globalClass);

        it.start();

        DecrementingThread dt = new DecrementingThread(globalClass);

        dt.start();

        try {

            it.join();

            dt.join();

        } catch (InterruptedException e) {

            System.out.println(e.getMessage());

        }

        System.out.println("Final global = " + globalClass.getGlobal());

    }

}
