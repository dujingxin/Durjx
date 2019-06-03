package com.durjx.io;

import java.io.*;

public class input {
  public static void main(String[] args) throws Exception {
    /* FileInputStream 用于读取诸如图像数据之类的原始字节流。要读取字符流，请考虑使用 FileReader。*/
    InputStream is = new FileInputStream(new File("C://Users//Administrator//Desktop//11.txt"));
    // FileOutputStream(File file, boolean append)
    // 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。 如果为 true，则将字节写入文件末尾处，而不是写入文件开始处
    OutputStream os = new FileOutputStream(new File("C://Users//Administrator//Desktop//12.txt"));
    // File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
    OutputStream os2 =
        new FileOutputStream(
            new File(new File("C://Users//Administrator//Desktop//"), "13.txt"), true);
    // File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
    OutputStream os3 =
        new FileOutputStream(new File("C://Users//Administrator//Desktop//", "13.txt"));
    System.out.println(is.available()); //  返回此输入流下一个方法调用可以不受阻塞地从此输入流读取（或跳过）的估计字节数。
    // is.mark(100); // 在此输入流中标记当前的位置。
    boolean isSupport = is.markSupported(); // 测试此输入流是否支持 mark 和 reset 方法。
    System.out.println(
        ((FileInputStream) is)
            .getFD()); // 返回表示到文件系统中实际文件的连接的 FileDescriptor 对象，该文件系统正被此 FileInputStream 使用。
    System.out.println(isSupport);
    is.skip(10); // 跳过和丢弃此输入流中数据的 n 个字节。
    byte[] bt = new byte[1000];
    is.read(bt);
    System.out.println(bt.length);
    /* for (int i = 0; i < bt.length; i++) {
      System.out.println(bt[i]);
    }*/
    os.write(bt); // 将 b.length 个字节从指定 byte 数组写入此文件输出流中。
    os.write(bt, 10, 100); //   将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
    os2.write(bt); // 将指定字节写入此文件输出流。
    is.close();
    os.close();
    os2.close();
  }
}
