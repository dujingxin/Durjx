package com.durjx.proxy;

public class testMain {
  public static void main(String[] args) {

    String a = "abc";
    String b = "abd";
    StringBuffer sb = new StringBuffer();

    int[] as = {1, 2, 3, 4, 5};

    char[] chars = a.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      System.out.println(b.substring(i, i + 1) + "  " + b.substring(i, i + 1).hashCode());
      System.out.println((int) chars[i]);
    }
  }
}
