package com.example.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListIntersectionTest {

    private LinkedListIntersection linkedListIntersection = new LinkedListIntersection();

    @Test
    void getValueAtIntersectingNode() {
        LinkedList<Integer> listA = new LinkedList<>(Arrays.asList(3,7,8,10));
        LinkedList<Integer> listB = new LinkedList<>(Arrays.asList(99,1,8,10));
        Optional<Integer> result = linkedListIntersection.getValueAtIntersectingNode(listA, listB);
        assertTrue(result.isPresent());
        assertEquals(8, result.get());
    }

    @Test
    void returnEmptyIfNoIntersectingNode() {
        LinkedList<Integer> listA = new LinkedList<>(Arrays.asList(3,7,8,10));
        LinkedList<Integer> listB = new LinkedList<>(Arrays.asList(99,1,9,11));
        Optional<Integer> result = linkedListIntersection.getValueAtIntersectingNode(listA, listB);
        assertFalse(result.isPresent());
    }
}