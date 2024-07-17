package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList001 {



    public static void main(String[] args) {


        List myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        System.out.println(myList.get(0));
        System.out.println(myList.size());
        System.out.println(myList.indexOf(5));
        System.out.println(myList.remove(5));
        System.out.println(myList);

        System.out.println("===========");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("===========");

        for (Object o : myList) {

            System.out.println(o);

        }

        System.out.println("===========");


        Iterator it = myList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
