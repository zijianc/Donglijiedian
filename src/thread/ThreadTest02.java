package thread;

public class ThreadTest02 {
    public static void main(String[] args) {
        /*myThread02 m=new myThread02();
        Thread t =new Thread(m);*/


        /*Thread t = new Thread(new myThread02());
        t.start();*/

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("支线线程" + i);
                }
            }
        });
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程" + i);
        }
    }
}

/*
class myThread02 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("支线线程" + i);
        }
    }
}*/
