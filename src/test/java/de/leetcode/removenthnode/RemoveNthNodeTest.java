package de.leetcode.removenthnode;

import org.junit.jupiter.api.Test;

import de.leetcode.util.ListNode;

public class RemoveNthNodeTest {


    private final RemoveNthNode removeNthNode = new RemoveNthNode();


    @Test
    public void removeNthNodeTest() {

        ListNode list = createList();

        ListNode newList = removeNthNode.removeNthNode(list, 3);


    }



    private ListNode createList() {

        ListNode start = new ListNode(1);
        ListNode startCopy = start;

        for (int i = 2; i < 10; i++) {
            ListNode node = new ListNode(i, start);
            start = node;
        }

        return startCopy;
    }


    private ListNode findNthElementFromEnd() {
        return null;

    }

}