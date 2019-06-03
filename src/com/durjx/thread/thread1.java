package com.durjx.thread;

class Thread1 implements Runnable {
  private String name;

  public Thread1(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println(name + " 线程运行开始!");
    for (int i = 0; i < 5; i++) {
      System.out.println(name + "运行  :  " + i);
      try {
        Thread.sleep((int) Math.random() * 10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println(name + " 线程运行结束!");
  }
}
