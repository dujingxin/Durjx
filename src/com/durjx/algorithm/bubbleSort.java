package com.durjx.algorithm;

public class bubbleSort {

  public static void sort(int a[], int n) {
    int i, j, tmp;
    for (i = 0; i < n; i++) {
      for (j = 0; j < n - i; j++) {
        if (a[j] < a[j - 1]) {
          tmp = a[j - 1];
          a[j - i] = a[j];
          a[j] = tmp;
        }
      }
    }
  }
}
