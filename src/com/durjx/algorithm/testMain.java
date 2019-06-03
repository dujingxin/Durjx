package com.durjx.algorithm;

import java.util.Arrays;

public class testMain {
  public static void main(String[] args) {
    int[] a = {1, 3, 5, 7, 9, 24, 45, 61, 67, 78};

    /* bubbleSort bs = new bubbleSort();
    bs.sort(a, 10);*/

    System.out.println(Arrays.toString(a));
    biSearch biSearch = new biSearch();
    int reslut = biSearch.search(a, 67);
    System.out.println(reslut);
  }
}
