// PROBLEM 1431: Kids With the Greatest Number of Candies

// SOLUTION:

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

       List<Boolean> ls = new ArrayList<Boolean>();

       int max =  candies[0];
       for(int i=1;i<candies.length;i++){
           if(candies[i] > max){
               max = candies[i];
           }
       }
       for(int j=0;j<candies.length;j++){
           if((candies[j]+extraCandies)>=max){
               ls.add(true);
           }
           else{
               ls.add(false);
           }
       }
       return ls;
    }
}


