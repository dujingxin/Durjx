package com.durjx.algorithm;

import java.util.Arrays;

/**
 * 直接插入排序
 *
 * <p>从数组的第二个元素开始，若比前一个元素小，就向前移动（若大于就不用移动），直到插入到合适的位置，然后再去排第三个元素，依次类推，最后一个插入到合适位置时，数组的排序就完成了。
 */
public class insertSort {
  public static int[] sort(int[] a) {
    int tmp;
    int length = a.length;
    if (length == 0) {
      throw new IllegalArgumentException();
    }
    for (int i = 1; i < length - 1; i++) { // 比较次数,从最后一位向前比较，比它大则交换位置
      int value = a[i];
      int index = i - 1;
      while (index >= 0 && a[i] < a[i - 1]) {
        a[i] = a[i - 1];
        index--;
      }
      a[index + 1] = value;
    }

    return a;
  }

  public static void main(String[] args) {
    int a[] = {2, 1, 4, 3, 5};
    insertSort.sort(a);
    System.out.println(Arrays.toString(a));
  }
}
