package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SolutionTest {
    Solution solution = new Solution();


    @Test
    @DisplayName("{ 2,1,1}, { 1,1,0 }, { 0,1,1} ")
    public void test1() {
        assertEquals(4, solution.orangesRotting(new int[][] { { 2,1,1}, { 1,1,0 }, { 0,1,1} }));
    }

    @Test
    @DisplayName("{ 2,1,1}, { 0,1,1 }, { 1,0,1} } ")
    public void test2() {
        assertEquals(-1, solution.orangesRotting(new int[][] { { 2,1,1}, { 0,1,1 }, { 1,0,1} }));
    }

    @Test
    @DisplayName("{ 0,2 }")
    public void test3() {
        assertEquals(0, solution.orangesRotting(new int[][] { {0,2} }));
    }

    @Test
    @DisplayName("{ { 2,2,0}, { 1,1,0 }, { 0,0,0} }")
    public void test5() {
        assertEquals(1, solution.orangesRotting(new int[][] { { 2,2,0}, { 1,1,0 }, { 0,0,0} }));
    }

    @Test
    @DisplayName("{ { 2,2,0}, { 1,0,0 }, { 1,0,0} }")
    public void test6() {
//        Solution solution1 = new Solution();
        assertEquals(2, solution.orangesRotting(new int[][] { { 2,2,0}, { 1,0,0 }, { 1,0,0} }));
    }

    @Test
    @DisplayName("{ { 2,2,0}, { 0,1,0 }, { 0,1,0} }")
    public void test7() {
//        Solution solution1 = new Solution();
        assertEquals(2, solution.orangesRotting(new int[][] { { 2,2,0}, { 0,1,0 }, { 0,1,0} }));
    }

}