package de.leetcode.rotatelist;

import de.leetcode.util.ListNode;
import de.leetcode.util.Util;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionRotateListTest {


    SolutionRotateList solutionRotateList = new SolutionRotateList();

    @BeforeEach
            void setup() {

        solutionRotateList = new SolutionRotateList();
    }


        @Test
        public void test() {
            final int[] values = new int[] {1, 2, 3, 4, 5, 6};

            ListNode l = Util.createList(values);
           ListNode res = solutionRotateList.rotateRight(l,2) ;
           System.out.println(res);

        }

    @Test
    public void test2() {
        final int[] values = new int[] {0, 1, 2};

        ListNode l = Util.createList(values);
        ListNode res = solutionRotateList.rotateRight(l,4) ;
        System.out.println(res);

    }

    @Test
    public void test3() {
        final int[] values = new int[] {1};

        ListNode l = Util.createList(values);
        ListNode res = solutionRotateList.rotateRight(l,99) ;
        System.out.println(res);

    }
}