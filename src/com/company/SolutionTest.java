package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SolutionTest {

    @Test
    @DisplayName("{ 2,1,1}, { 1,1,0 }, { 0,1,1} ")
    public void test1() {
        Solution solution1 = new Solution();
        assertEquals(4, solution1.orangesRotting(new int[][] { { 2,1,1}, { 1,1,0 }, { 0,1,1} }));
    }

    @Test
    @DisplayName("{ 2,1,1}, { 0,1,1 }, { 1,0,1} } ")
    public void test2() {
        Solution solution2 = new Solution();
        assertEquals(-1, solution2.orangesRotting(new int[][] { { 2,1,1}, { 0,1,1 }, { 1,0,1} }));
    }

    @Test
    @DisplayName("{ 0,2 }")
    public void test3() {
        Solution solution3 = new Solution();
        assertEquals(0, solution3.orangesRotting(new int[][] { {0,2} }));
    }
}