package lambda;

/**
 * Created by dwy on 2015/10/28.
 */
public class TestRunnable {
    public static void main(String[] args) {
    /*    Runnable r = new Runnable(){
            public void run(){
                System.out.println("hello,lambda!");
            }
        };
        r.run();*/


        Runnable r = ()->System.out.println("hello,lambda");
        r.run();

        Runnable r1 = ()->{
            System.out.println("hello,lambda");
            System.out.println("hello,lambda1");
        };
        r1.run();

        new Thread(() -> {
            connectToService();
            sendNotification();
        }).start();
    }

    public static void  connectToService(){
        String s = "";
        s.compareToIgnoreCase("");
    }

    public static void  sendNotification(){

    }
}
