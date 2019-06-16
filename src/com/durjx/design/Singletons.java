package com.durjx.design;

public class Singletons {

  private static Singletons singletons;
  private static volatile Singletons singletons2;

  /**
   * 线程不安全
   *
   * @return
   */
  private static Singletons getInstance() {
    if (singletons == null) {
      System.out.println("singletons is null");
      singletons = new Singletons();
      return singletons;
    }
    return singletons;
  }

  /**
   * 线程安全
   *
   * @return
   */
  private static synchronized Singletons getSafeInstance() {
    if (singletons == null) {
      singletons = new Singletons();
      return singletons;
    }
    return singletons;
  }

  /**
   * volatile 和 sychronized 双重校验保证线程安全
   *
   * @return
   */
  private static synchronized Singletons getSafe2Instance() {
    if (singletons2 == null) {
      singletons2 = new Singletons();
      return singletons2;
    }
    return singletons2;
  }

  /** 内部类创建单例对象 */
  public static class staticClass {
    private static final Singletons singletons = new Singletons();
  }

  // 内部类实例方法
  private static Singletons getStaticInstance() {
    return staticClass.singletons;
  }

  public static void main(String[] args) {
    Singletons gi = Singletons.getInstance();
    Singletons j2 = Singletons.getInstance();
    Singletons static1 = staticClass.singletons;
    Singletons static2 = staticClass.singletons;
    // 验证指向是否相同
    System.out.println(gi == j2);
    System.out.println(static1 == static2);
  }
}
