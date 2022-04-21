package thread;

//实现线程有两种方式
//第一种,创建一个类，继承Thread,并重写run()方法
public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程" + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程" + i);
        }
    }
}