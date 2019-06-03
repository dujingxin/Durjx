package com.durjx.io;

import java.io.*;

public class fileClass {
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("C://Users//Administrator//Desktop//");
    File[] fileList = file.listFiles();
    /*for (File files : fileList) {
      System.out.println(files.getAbsolutePath() + " " + files.getName());
      System.out.println(files.list());
    }*/
    InputStream is = new FileInputStream(new File("C://Users//Administrator//Desktop//11.txt"));
    OutputStream os = new FileOutputStream("C://Users//Administrator//Desktop//13.txt");
    BufferedInputStream bi = new BufferedInputStream(is);
    BufferedOutputStream bo = new BufferedOutputStream(os);

    BufferedReader buf;

    byte[] bt = new byte[1000];
    try {
      bi.read(bt);
      bo.write(bt);
      bi.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
