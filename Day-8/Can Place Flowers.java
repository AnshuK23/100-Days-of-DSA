// PROBLEM 605: Can Place Flowers

// SOLUTION:

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int total = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
               int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1]; 
               int prev = (i == 0) ? 0 : flowerbed[i - 1];
               if(next == 0 && prev == 0) {
                   flowerbed[i] = 1;
                   total++;
               }
            }
        }
        
        return total >= n;
    }
}
