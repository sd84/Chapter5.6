package com.company;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class OtherList {
    private ArrayList<String> list;

    public OtherList() {
        this.list = new ArrayList<>();
    }

    public void set_values() {
        Scanner in = new Scanner(System.in);
        String text;
        int size;
        System.out.println("Enter your list capacity:");
        size = in.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter you value:");
            text = in.next();
            list.add(text);
        }
    }

    public void get_values() {
        ListIterator<String> lst = list.listIterator();
        while (lst.hasNext()) {
            System.out.println(lst.next());
        }
    }

}
