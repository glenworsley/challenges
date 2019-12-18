package com.example.challenges;

import java.util.*;

public class LinkedListIntersection {

    /**
     * Returns Optional for Integer at intersecting node of the 2 linked lists.
     * Needs to be done in O(M+N) time where M = length of listA and N = length of listB.
     * @param listA
     * @param listB
     * @return value at intersecting node of the 2 linked lists.  If no intersection, Optional will be empty.
     */
    public Optional<Integer> getValueAtIntersectingNode(LinkedList<Integer> listA, LinkedList<Integer> listB) {
        Set<Integer> listAValues = new HashSet<>(listA);
        return listB.stream().filter(element -> listAValues.contains(element)).findFirst();
    }
}
