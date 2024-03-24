class Solution {

    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public String reverseVowels(String s) {
        int n = s.length();

        //using two pointer approach
        int start = 0;
        int end = n-1;
        char[] chars = s.toCharArray();

        // traversing the string until start ! = end
        while(start < end){
            if(!isVowel(chars[start])){
                start++;
            }else if(!isVowel(chars[end])){
                end--;
            }else{
                //both are vowels
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                
                start++;
                end--;
            }
        }

        return new String(chars);
    }
}
