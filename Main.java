package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        chapter1();
        chapter2();
        chapter3();
        chapter4();
        chapter5();
        chapter6();
        chapter7();

    }

    private static void chapter1() {
        System.out.println("Chapter 1 ---------");
        List<Integer> list = new ArrayList(Arrays.asList(1,2,3));
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }

    private static void chapter2() {
        System.out.println("Chapter 2 ---------");
        Collection<Integer> list = new ArrayList(Arrays.asList(1,2,3));
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }

    private static void chapter3() {
        System.out.println("Chapter 3 ---------");
        var list = new ArrayList(Arrays.asList(1,2,3));
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }

    private static void chapter4() {
        System.out.println("Chapter 4 ---------");
        List<Integer> list = Arrays.asList(1,2,3);
        try{
            list.add(2);
            System.out.println("success added");
        }
        catch(Exception e){
            System.out.println("Exception added");
        }

        try{
            list.set(2, 2);
            System.out.println("success set");
        }
        catch(Exception e){
            System.out.println("Exception set");
        }
        System.out.println(list);
    }

    private static void chapter5() {
        System.out.println("Chapter 5 ---------");
        //Use List.of() to achieve immutability instead of Arrays.asList
        List<Integer> list = List.of(1,2,3);
        try{
            list.add(2);
            System.out.println("success added");
        }
        catch(Exception e){
            System.out.println("Exception added");
        }

        try{
            list.set(2, 2);
            System.out.println("success set");
        }
        catch(Exception e){
            System.out.println("Exception set");
        }
        System.out.println(list);
    }

    private static void chapter6() {
        System.out.println("Chapter 6 ---------");
        for (int i = 0; i < 10; i++) {
            List<String> names = List.of("Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7");
            List<String> updatedNames = new ArrayList<>();

            names.stream()
                    .parallel()
                    .map(String::toUpperCase)
                    .forEach(updatedNames::add);
            System.out.println(names.size());
            System.out.println(updatedNames.size());
        }
    }

    private static void chapter7() {
        System.out.println("Chapter 7 ---------");
        int[] factor = new int[]{ 2 };
        var numbers = List.of(1,2,3);

        var stream = numbers.stream()
               .map(number -> number*factor[0]);
        factor[0] = 0;
        stream.forEach(System.out::print);
    }
}
