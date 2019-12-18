package com.example.challenges;

import java.util.*;

public class LinkedListIntersection {

    /**
     * Returns value at intersecting node of the 2 linked lists.
     * Needs to be done in O(M+N) time where M = length of listA and N = length of listB.
     * @param listA
     * @param listB
     * @return value at intersecting node of the 2 linked lists.  If no intersection, null is returned.
     */
    public Integer getValueAtIntersectingNode(LinkedList<Integer> listA, LinkedList<Integer> listB) {

        Integer valueAtIntersectingNode = null;

         //load all ints in listA into a Set
        Set<Integer> listAValues = new HashSet<>(listA);

        //loop through listB until find a value in the Set
        ListIterator<Integer> iterator = listB.listIterator();
        while (iterator.hasNext() && valueAtIntersectingNode == null) {
            Integer next = iterator.next();
            if (listAValues.contains(next))
                valueAtIntersectingNode = next;
        }

        return valueAtIntersectingNode;
    }
}
