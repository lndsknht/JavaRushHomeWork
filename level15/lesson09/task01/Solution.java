package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static
    {
      labels.put(2.0, "pervoe");
      labels.put(2.1, "vtoroe");
      labels.put(2.2, "tretie");
      labels.put(2.3, "chetv");
      labels.put(2.4, "pyztoe");
    }
}
