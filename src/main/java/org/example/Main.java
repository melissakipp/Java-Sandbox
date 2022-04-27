package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* Fill A List https://www.geeksforgeeks.org/initializing-a-list-in-java/
* */

public class Main {
    public static void main(String[] args) {

        List<Integer> largest = new ArrayList<> () {{
            add(11);
            add(200);
            add(43);
            add(84);
            add(9917);
            add(4321);
            add(1);
            add(33333);
            add(8997);
        }};

        List<Integer> largestTwo = Arrays.asList(987, 1234, 9381, 731, 43718, 8932);

        System.out.println(findLargest(largest) + " -> 33333");
        System.out.println(findLargest(largestTwo) + " -> 43718");

    }

    public static Integer findLargest(List<Integer> integerList) {

        return Collections.max(integerList);
    }
}