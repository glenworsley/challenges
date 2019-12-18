package com.example.challenges;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListIntersectionTest {

    @Test
    void getValueAtIntersectingNode() {

        LinkedList<Integer> listA = new LinkedList<>();
        listA.add(3);
        listA.add(7);
        listA.add(8);
        listA.add(10);

        LinkedList<Integer> listB = new LinkedList<>();
        listB.add(99);
        listB.add(1);
        listB.add(8);
        listB.add(10);

        LinkedListIntersection linkedListIntersection = new LinkedListIntersection();
        assertEquals(8, linkedListIntersection.getValueAtIntersectingNode(listA, listB));
    }
}