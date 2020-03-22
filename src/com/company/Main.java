package com.company;

import java.util.LinkedList;
import java.util.Queue;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        int o = solution.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}});
        System.out.println ("Minute :" + o);
    }
}

class Solution {

    class Orange {
        int x;
        int y;
        int minuteRotten;
        public Orange(int x, int y, int minuteRotten) {
            this.x = x;
            this.y = y;
            this.minuteRotten = minuteRotten;
        }
    }
    public static boolean stillUnrotten(int[][] numbers){
//        boolean minValue=numbers[0][0];
        for(int j=0;j<numbers.length;j++){
            for(int i=0;i<numbers[j].length;i++){
                if(numbers[j][i] == 1) return true;
            }
        }
        return false;
    }
    Queue<Orange> OQue = new LinkedList<>();

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = {{0,-1},{0,1},{-1,0},{1,0}};

        //Initialize the ripeVisitedMin
        //Add the first set of rottens to the Que
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    System.out.println("Init Added i " + i + " j " + j);
                    OQue.add(new Orange(i, j, 0));
                }
            }
        }
        int minutes = 0;

        while (!OQue.isEmpty()){
//            Orange o = OQue.remove();
            Orange o = OQue.poll();
            minutes = Math.max(minutes, o.minuteRotten);
            System.out.println("Removed i " + o.x + " j " + o.y);
            for(int[] dir: directions){
                if ((o.x+dir[0] < m) && (o.x+dir[0] >= 0) &&
                    (o.y+dir[1] < n) && (o.y+dir[1] >= 0) &&
                        (grid[o.x+dir[0]][o.y+dir[1]]== 1) &&
                        (grid[o.x][o.y]== 2)) {
                        System.out.println("Added i " + (o.x+dir[0]) + " j " + (o.y+dir[1]));
                        System.out.println("min " + minutes);
                    grid[o.x+dir[0]][o.y+dir[1]]= 2;
                    OQue.add(new Orange(o.x+dir[0], o.y+dir[1], o.minuteRotten+1));
                }
            }
        }

        if (stillUnrotten(grid)) return -1;
        else return minutes ;

        }

}