
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(17);
        Runnable task = () -> System.out.println("my task");
        executorService.execute(task);
        executorService.shutdown(); //Declines all new tasks(via method execute) and completes all existing tasks
    }
}

//        TwoMethodsInterface twoMethodsInterface = new TwoMethodsInterface() {
//            @Override
//            public void first() {
//                System.out.println("first");
//            }
//
//            @Override
//            public void second() {
//                System.out.println("second");
//            }
//        };

//        Runnable task = new Runnable() {  // syntax of anonymous class
//            @Override
//            public void run() {
//                System.out.println("lambda");
//                System.out.println("another command");
//            }
//        };
//{
//        Runnable task = ()-> {
//            System.out.println("lambda");
//            System.out.println("another command");
//        };
//
//        //if we have only one command in method run
//        Runnable task1 = ()-> System.out.println("lambda");
//        task1.run();//"lambda" will be printed
//
//        Runnable myTask = new MyRunnable();
//        myTask.run();// "my runnable" will be printed
//    }
//}
//
//
//interface  TwoMethodsInterface{
//    void first();
//
//    void second();
//}
//
//class MyRunnable implements Runnable{
//
//    @Override
//    public void run() {
//        System.out.println("my runnable");
//    }
//}
