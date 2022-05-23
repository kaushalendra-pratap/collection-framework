package com.sunglowsys;
import  java.util.*;

public class StartCode {
    public static void main(String[] args) {
        System.out.println("welcome to code java collection framework");

         //type safe

        ArrayList<String> names = new ArrayList<String>();
        names.add("beauty");
        names.add("Sitara");
        names.add("roshni");
        names.add("shivam");
        names.add("shivam");
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        //un type safe

     //   LinkedList list = new LinkedList();
    //    list.add("sachin");
    //    list.add("101");
   //     list.add("625.123");
   //     list.add("true");
    //     System.out.println(list);
        names.remove("shivam");
        System.out.println("Size = "+names.size());
//check item is there or noy
        // type ka equal method call krta hain cheking krne ke liye
        System.out.println(names.contains("beauty singh"));

        //check for empty
        System.out.println(names.isEmpty());

        //setting value
     //
        //   names.set(1,"govind");
        names.add(1,"mohit");
        System.out.println(names);

        //remove all elements
       // names.clear();
      //  System.out.println(names);

        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println("vector "+vector);
    }

}
