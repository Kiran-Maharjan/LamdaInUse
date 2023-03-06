public class Main {
    public static void main(String[] args) {

        //Function Interface has one abstract class and one abstract method.
        Thread runThread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside normal run thread!");

            }
        });
        runThread.run();

        Thread lamdaThread=new Thread(()->System.out.println("Using Lamda to print in Runnable"));
        lamdaThread.run();

    }
}