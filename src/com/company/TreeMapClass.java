package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {
    TreeMap<Integer, String> collectin;

    public TreeMapClass() {
        collectin = new TreeMap<>();
    }

    public void map_populate() {
        System.out.println("Enter size of collection:");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter your word:");
            String text = in.next();
            collectin.put(i + 1, text);

        }
    }

    public void get_keys() {
        Set<Integer> keys = collectin.keySet();
        for (int x : keys) {
            System.out.println(x);
        }
    }

}
