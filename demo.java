package utils;

import java.lang.reflect.Array;
import java.util.*;

public class demo {

    public static void main(String[] args) {
        int[] arr = new int[100];
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        int len = list.size();
        for (int i = 0; i < len; i++) {
            arr[i] = list.get(i);
        }
        arr[51] = 7;
        fun(arr);
    }
    //arr[50] = 2
    //arr[75] = 2
    public static void fun(int[] a) {
        int[] b = new int[a.length+1];
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[a[i]] == 1) {
                    System.out.println("repeat:" + a[i] + ",index:" + i);
                    break;
                }
            }
            b[a[i]] = 1;
        }
    }
}
