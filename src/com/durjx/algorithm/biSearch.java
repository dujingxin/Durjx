package com.durjx.algorithm;

public class biSearch {

  public int search(int[] arrays, int result) {
    int length = arrays.length - 1;
    int start = 0;
    int middle;
    int i;

    while (start <= length) {
      System.out.println("start:" + start + "  length:" + length);
      middle = (int) (Math.floor(length + start) / 2);
      System.out.println("middle:" + middle);
      if (arrays[middle] == result) {
        return middle;
      } else if (arrays[middle] > result) {
        length = middle - 1;
      } else {
        start = middle + 1;
      }
    }
    return -1;
  }
}
