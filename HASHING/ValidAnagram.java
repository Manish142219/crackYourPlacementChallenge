// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
       
        if(s.length() != t.length()){
            return false;
        } 

        for(int i = 0; i<s.length() ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        Set<Character> keySet = map.keySet();
        for(int i = 0 ; i<t.length() ; i++){
           
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))>0 ){
                int x = map.get(t.charAt(i));
                map.put(t.charAt(i), x-1 );
                
            }else{
                return false;
            }
            
        }
        return true;
    }
}
