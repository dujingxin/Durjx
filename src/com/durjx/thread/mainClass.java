package com.durjx.thread;

public class mainClass {
  public static void main(String[] args) {
    Thread1 t1 = new Thread1("A");
    Thread1 t2 = new Thread1("B");

    Thread T1 = new Thread(t1);
    Thread T2 = new Thread(t2);

    new Thread(new Thread1("C")).start();
    // Thread类的setPriority()和getPriority()方法分别用来设置和获取线程的优先级。
    T1.setPriority(10);
    System.out.println("T2的优先级：" + T1.getPriority());
    // Thread.yield() 方法，暂停当前正在执行的线程对象，把执行机会让给相同或者更高优先级的线程。
    // T2.yield();
    System.out.println(Thread.currentThread().getName() + "主线程开始运行");
    // 启动线程，线程的状态变为 Runnable

    T1.start();
    try {
      T1.sleep(1000);
      T1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    T2.start();
    /*    try {
      T1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    try {
      T2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }*/
    // join()的作用是：“等待该线程终止”，这里需要理解的就是该线程是指的主线程等待子线程的终止。
    // 也就是在子线程调用了join()方法后面的代码，只有等到子线程结束了才能执行。
    System.out.println(Thread.currentThread().getName() + "主线程结束");
  }
}
