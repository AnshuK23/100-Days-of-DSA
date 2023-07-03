// PROBLEM 345: Reverse Vowels of a String
// SOLUTION:

class Solution {

    public static boolean isVowel(char car_arr[],int indx){
        char ch = car_arr[indx];

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
           return true;
        }
        return false;
    }
    
    public static void swap(char car_arr[],int i , int j){
        char temp = car_arr[i];
        car_arr[i] = car_arr[j];
        car_arr[j] = temp;
    }

    public String reverseVowels(String s) {
        
        char car_arr[] = s.toCharArray();

        int i = 0;
        int j = car_arr.length-1;

        while(i<j){

            while(i<j && isVowel(car_arr,i) == false){
                i++;
            }

            while(i<j && isVowel(car_arr,j) == false){
                j--;
            }

            swap(car_arr,i,j);

            i++;
            j--;
        }

        String str = "";
        for(char ch : car_arr){
            str += ch;
        }
        return str;
    }
}
