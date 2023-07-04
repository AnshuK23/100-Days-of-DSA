// PROBLEM 151: Reverse Words in a String

// SOLUTION:

class Solution {
    public String reverseWords(String s) {
     StringBuilder sb= new StringBuilder();
        String s1[] = s.split(" ");

        for(int i = s1.length-1;i>=0;i--){
          if(s1[i] != ""){
           sb.append(s1[i]);
           sb.append(" ");
          } 
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }

}
